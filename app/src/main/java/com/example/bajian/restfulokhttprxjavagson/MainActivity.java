package com.example.bajian.restfulokhttprxjavagson;

import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.bajian.restfulokhttprxjavagson.api.MyApi;
import com.example.bajian.restfulokhttprxjavagson.client.RetrofitPHPUtils;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
        myApi.getQuestion(100)
                .subscribeOn(Schedulers.immediate())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::addQuestion, this::handleError);
/*        myApi.getBanner()
                .subscribeOn(Schedulers.immediate())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::addBannerDatas, this::handleError);*/


       /*http://www.tuicool.com/articles/iQJJJ3Y
        下面是可能会用到Scheduler：

        Schedulers.computation()：用于计算型工作例如事件循环和回调处理，不要在I/O中使用这个函数（应该使用Schedulers.io()函数）；

        Schedulers.from(executor)：使用指定的Executor作为Scheduler；

        Schedulers.immediate()：在当前线程中立即开始执行任务；

        Schedulers.io()：用于I/O密集型工作例如阻塞I/O的异步操作，这个调度器由一个会随需增长的线程池支持；对于一般的计算工作，使用Schedulers.computation()；

        Schedulers.newThread()：为每个工作单元创建一个新的线程；

        Schedulers.test()：用于测试目的，支持单元测试的高级事件；

        Schedulers.trampoline()：在当前线程中的工作放入队列中排队，并依次操作。

        通过设置observeOn和subscribeOn调度器，我们定义了网络请求使用哪个线程（Schedulers.newThread()）。*/
    }

/*
    private void runMe() throws InterruptedException {
        synchronized (this){
            Log.d(TAG,  Thread.currentThread().getName()+"begin");
            Thread.sleep(10000);
            Log.d(TAG, Thread.currentThread().getName() +"end");
        }
    }*/
    class MyThread extends Thread{
        @Override
        public void run() {
            synchronized (this){
                Log.d(TAG,  Thread.currentThread().getName()+"begin");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.d(TAG, Thread.currentThread().getName() +"end");
            }
        }}
        public void go(View view){
//            ExecutorService pool=Executors.newFixedThreadPool(5);
            ExecutorService pool=Executors.newSingleThreadExecutor();
            for(int i=0;i<7;i++){
                pool.submit(new MyThread());
            }
            pool.shutdown();
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runMe();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();*/
    }
    private void addBannerDatas(List<BannerData> bannerDatas) {
        Log.d(TAG, "bannerDatas.size()" + bannerDatas.get(0).getBannerUrl());
    }

    private void addQuestion(QuestionBean mQuestionBean) {
        Log.d(TAG,  "bannerDatas.size()"+mQuestionBean.getStatus());
    }

    private void handleError(Throwable throwable) {
        Log.d(TAG,  "handleError()"+throwable.getCause());
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
