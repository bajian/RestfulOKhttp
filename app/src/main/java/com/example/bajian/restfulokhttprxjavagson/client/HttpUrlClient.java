package com.example.bajian.restfulokhttprxjavagson.client;

import com.example.bajian.restfulokhttprxjavagson.persistence.Constant;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.apache.http.client.ClientProtocolException;

import java.io.IOException;

/**
 * 请求PHP网页前缀
 * Created by LC on 2015/5/28.
 */
public class HttpUrlClient {

    public static String getPhpUrl() {
        String str = "";
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(Constant.API_URL)
                    .build();
            Response response = client.newCall(request).execute();
            str = response.body().string();
            return str;
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
