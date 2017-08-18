package com.umer.andriod.retrofit_network_sample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.umer.andriod.retrofit_network_sample.model.LoginResponse;
import com.umer.andriod.retrofit_network_sample.network.ApiService;
import com.umer.andriod.retrofit_network_sample.network.RequestCode;
import com.umer.andriod.retrofit_network_sample.network.RestCallbackObject;
import com.umer.andriod.retrofit_network_sample.network.RestClient;
import com.umer.andriod.retrofit_network_sample.network.ServerConnectListenerObject;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity implements ServerConnectListenerObject, View.OnClickListener {

    EditText txtEmail, txtPassword;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mContext = this;
        txtEmail = (EditText) findViewById(R.id.et_email);
        txtPassword = (EditText) findViewById(R.id.et_password);

        Button btn = (Button) findViewById(R.id.btn_login);
        btn.setOnClickListener(this);
    }

    @Override
    public void onFailure(String error, RequestCode requestCode) {

        Log.d("Andriod_umer", error);
    }

    @Override
    public void onSuccess(Object object, RequestCode requestCode) {
        if (requestCode == RequestCode.LOGIN_REQUEST_CODE) {
            LoginResponse loginObj = (LoginResponse) object;
            Log.d("Andriod_umer", loginObj.getData().getEmail());
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                ApiService mService = RestClient.getInstance(mContext, false, false);
                Call<LoginResponse> userObject = mService.login(txtEmail.getText().toString(), txtPassword.getText().toString());
                RestCallbackObject callbackObject = new RestCallbackObject(this, this, RequestCode.LOGIN_REQUEST_CODE).showProgress(true, 0).dontHideProgress(false);
                userObject.enqueue(callbackObject);
                break;
        }
    }
}
