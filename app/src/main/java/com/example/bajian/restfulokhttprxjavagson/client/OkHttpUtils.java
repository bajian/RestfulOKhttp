package com.example.bajian.restfulokhttprxjavagson.client;

/**
 * Created by LC on 2015/6/3.
 */

import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

/**
 * OkHttpClient自定义工具类
 */
public class OkHttpUtils {

    private static OkHttpClient singleton;

    public static OkHttpClient getInstance(long timeOut) {
        if (singleton == null) {
            synchronized (OkHttpUtils.class) {
                if (singleton == null) {
//                    File cacheDir = new File(BaseApplication.getContext().getCacheDir(), CostomConfig.RESPONSE_CACHE);

                    singleton = new OkHttpClient();
//                    try {
//                        singleton.setCache(new Cache(cacheDir, CostomConfig.RESPONSE_CACHE_SIZE));
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }

                    long tempTimeout = timeOut == 0 ? CostomConfig.HTTP_CONNECT_TIMEOUT : timeOut;
                    singleton.setConnectTimeout(tempTimeout, TimeUnit.SECONDS);
                    singleton.setReadTimeout(CostomConfig.HTTP_READ_TIMEOUT, TimeUnit.SECONDS);
                }
            }
        }
        return singleton;
    }

}
