package com.example.bajian.restfulokhttprxjavagson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.bajian.restfulokhttprxjavagson.api.MyApi;
import com.example.bajian.restfulokhttprxjavagson.client.RetrofitPHPUtils;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity {

    private static String TAG="MainActivity";

    private MyApi myApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myApi = RetrofitPHPUtils.createApi(MyApi.class);
        myApi.getBanner()
                .subscribeOn(Schedulers.immediate())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(bannerDatas -> addBannerDatas(bannerDatas),throwable -> handleError(throwable));

    }


    private void addBannerDatas(List<BannerData> bannerDatas) {
        Log.d(TAG,  "bannerDatas.size()"+bannerDatas.size() );
    }

    private void handleError(Throwable throwable) {
        Log.d(TAG,  "handleError()"+throwable.getCause());
        Log.d(TAG,  "handleError()"+throwable.toString());
        Log.d(TAG,  "handleError()"+throwable.getLocalizedMessage());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
