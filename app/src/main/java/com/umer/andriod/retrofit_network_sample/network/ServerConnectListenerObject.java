package com.umer.andriod.retrofit_network_sample.network;

public interface ServerConnectListenerObject {
    public void onFailure(String error, RequestCode requestCode);

    public void onSuccess(Object object, RequestCode requestCode);
}
