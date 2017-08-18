package com.umer.andriod.retrofit_network_sample.network;

import android.app.Activity;
import android.app.ProgressDialog;
import android.util.Log;

import com.google.gson.Gson;
import com.umer.andriod.retrofit_network_sample.BuildConfig;
import com.umer.andriod.retrofit_network_sample.R;
import com.umer.andriod.retrofit_network_sample.base.IMDroidApplication;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class RestCallbackObject implements Callback {
    private int msgResId = R.string.progressbar_default_msg;
    private ProgressDialog progressDialog = null;
    private ServerConnectListenerObject callback;
    private boolean isCanceled = false;
    private boolean dontHideProgress = false;
    private Activity context;
    private RequestCode requestCode;

    public RestCallbackObject(Activity context, ServerConnectListenerObject callback, RequestCode requestCode) {
        this.context = context;
        this.callback = callback;
        this.requestCode = requestCode;
    }

    public RestCallbackObject showProgress(boolean showProgress, int mmsgResId) {
        if (mmsgResId != 0)
            this.msgResId = mmsgResId;
        if (showProgress) {
//            showProgress(msgResId);
        }
        return this;
    }

    public RestCallbackObject dontHideProgress(boolean dontHideProgress) {//true incase don't want to hide progress
        this.dontHideProgress = dontHideProgress;
        return this;
    }

    public void cancel() {
        isCanceled = true;
    }

    public boolean isCancelled() {
        return isCanceled;
    }

    public void stopProgress() {
        if (progressDialog != null && progressDialog.isShowing() && !dontHideProgress) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void onResponse(Call call, Response response) {
        if (isCancelled()) {
            return;
        }
        if (call != null && !call.isCanceled()) {
            call.cancel();
        }
        if (BuildConfig.DEBUG) {
            Log.e("onResponse: ====>", new Gson().toJson(response.raw().body().toString()));
        }

        stopProgress();

        if (response.isSuccessful()) {
            if (BuildConfig.DEBUG) {
                Log.e("onSuccess onResponse", new Gson().toJson(response.body()));
            }
            try {
                callback.onSuccess(response.body(), requestCode);
            } catch (Throwable t) {
                //Exception caught from response.body() method
                callback.onFailure(NetworkErrorHandler.get(context, t), requestCode);
            }
        } else {
//            KLog.e("handle request errors yourself");
            int statusCode = response.code();
            // handle request errors yourself
            try {
                if (statusCode == 404) {
                    callback.onFailure(IMDroidApplication.getAppResources().getString(R.string.error_404), requestCode);
                } else {
                    ResponseBody errorBody = response.errorBody();
                    Log.e("onFailure onResponse", new Gson().toJson(response.errorBody()));
                    callback.onFailure(errorBody.toString(), requestCode);
                }
            } catch (Throwable t) {
                //Exception caught from response.errorBody().string() method
                callback.onFailure(NetworkErrorHandler.get(context, t), requestCode);
            }

        }

    }

    @Override
    public void onFailure(Call call, Throwable t) {
        if (call != null && !call.isCanceled()) {
            call.cancel();
        }
        t.printStackTrace();
        callback.onFailure(NetworkErrorHandler.get(context, t), requestCode);
        stopProgress();
    }

}