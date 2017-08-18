package com.umer.andriod.retrofit_network_sample.network;

public interface ServerConnectListener {
    public void onFailure(String error, RequestCode requestCode);

    public void onSuccess(String response, RequestCode requestCode);
}
