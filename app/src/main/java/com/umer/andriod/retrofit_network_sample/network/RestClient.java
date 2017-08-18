package com.umer.andriod.retrofit_network_sample.network;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.umer.andriod.retrofit_network_sample.BuildConfig;


import java.lang.reflect.Modifier;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {


    private static ApiService service;

    public static ApiService getInstance(Context context, boolean isUploading, boolean isSalesForce) {
//        if (isUploading) {
//            if (service != null) {
//                service = null;
//            }
//        }
//        if (isSalesForce) {
        if (service != null) {
            service = null;
        }
//        }
        if (service == null) {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd HH:mm:ss")
                    .excludeFieldsWithModifiers(Modifier.TRANSIENT)
                    .create();
            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
            if (isUploading) {
                builder.readTimeout(30, TimeUnit.MINUTES);
                builder.connectTimeout(30, TimeUnit.MINUTES);
                builder.writeTimeout(30, TimeUnit.MINUTES);
            } else {
                builder.readTimeout(50, TimeUnit.SECONDS);
                builder.connectTimeout(50, TimeUnit.SECONDS);
                builder.writeTimeout(50, TimeUnit.SECONDS);
            }
            if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                builder.addInterceptor(interceptor);
            }

            int cacheSize = 2 * 1024 * 1024; // 2 MiB
            Cache cache = new Cache(context.getCacheDir(), cacheSize);
            builder.cache(cache);

            String baseURL = AppWebServices.BASE_URL;
            //String baseURL = AppPreference.getValue(Application.getAppContext(), AppKeys.KEY_BASE_URL);
            if (isSalesForce) {
                baseURL = AppWebServices.SALES_FORCE_BASE_URL;
            }
            Retrofit retrofit = new Retrofit
                    .Builder()
                    .client(builder.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(baseURL).build();
            service = retrofit.create(ApiService.class);

            return service;
        } else {
            return service;
        }
    }

//    public static ApiService getInstanceWithoutBaseUrl(Context context) {
//        if (service == null) {
//            Gson gson = new GsonBuilder()
//                    .setDateFormat("yyyy-MM-dd HH:mm:ss")
//                    .excludeFieldsWithModifiers(Modifier.TRANSIENT)
//                    .create();
//            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
//            builder.readTimeout(30, TimeUnit.SECONDS);
//            builder.connectTimeout(30, TimeUnit.SECONDS);
//            builder.writeTimeout(30, TimeUnit.SECONDS);
//            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//            builder.addInterceptor(interceptor);
//            int cacheSize = 2 * 1024 * 1024; // 2 MiB
//            Cache cache = new Cache(context.getCacheDir(), cacheSize);
//            builder.cache(cache);
//
//            Retrofit retrofit = new Retrofit
//                    .Builder()
//                    .client(builder.build())
//                    .addConverterFactory(ToStringConverterFactory.create())
//                    .addConverterFactory(GsonConverterFactory.create(gson))
//                    .build();
//            service = retrofit.create(ApiService.class);
//
//            return service;
//        } else {
//            return service;
//        }
//    }
}
