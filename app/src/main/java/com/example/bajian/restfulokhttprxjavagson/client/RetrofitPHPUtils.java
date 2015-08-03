package com.example.bajian.restfulokhttprxjavagson.client;

/**
 * Created by LC on 2015/6/3.
 */


import com.example.bajian.restfulokhttprxjavagson.persistence.Constant;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

public class RetrofitPHPUtils {

    private static RestAdapter singleton;
    public static ExecutorService mExecutorService;

    public static String API_URL = Constant.API_URL;


    public static <T> T createApi(Class<T> clazz) {
        return createApi(clazz,0,API_URL);
    }

    public static <T> T createApi(Class<T> clazz,String api) {
        return createApi(clazz,0,api);
    }

    public static <T> T createApi(Class<T> clazz,long timeOut,String api) {
        if (singleton == null) {
            synchronized (RetrofitPHPUtils.class) {
                if (singleton == null) {
                    RestAdapter.Builder builder = new RestAdapter.Builder();
                    builder.setRequestInterceptor((RequestInterceptor.RequestFacade request)-> {
                            request.addHeader("User-Agent", "Android");
                    });

                    builder.setEndpoint(api);
                    builder.setClient(new OkClient(OkHttpUtils.getInstance(timeOut)));
                    builder.setLogLevel(RestAdapter.LogLevel.FULL);
                    singleton = builder.build();
                }
            }
        }
        return singleton.create(clazz);
    }

    public static void stopAll() {
        if(mExecutorService == null) {
            mExecutorService = Executors.newCachedThreadPool();
        }
        List<Runnable> pendingAndOngoing = mExecutorService.shutdownNow();
    }
}