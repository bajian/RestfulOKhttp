package com.example.bajian.restfulokhttprxjavagson.api;

import com.example.bajian.restfulokhttprxjavagson.BannerData;
import com.example.bajian.restfulokhttprxjavagson.QuestionBean;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by ihgoo on 2015/5/18.
 */
public interface MyApi {

    @GET("/ad.html")
    Observable<List<BannerData>> getBanner();

    @GET("/getQuestionList?UID=10596&Timestamp=1433490635&Nonce=82306937&Signature=ed4adcc0288bc5965dbcd624fe9163a3b3c87392")
    Observable<QuestionBean> getQuestion(@Query("p") int page);
//@Path URL上的参数
//@Field("tid") String tid  @FormUrlEncoded POST
//@Query("p") int page  提交的参数
//http://new.snewfly.com/getQuestionList?UID=10596&
//Timestamp=1433490635&Nonce=82306937&Signature=ed4adcc0288bc5965dbcd624fe9163a3b3c87392&p=100

/*
    @GET("/go/{node}")
    Observable<Response> getTopicsList(@Query("p") int page, @Path("node") String node);

    @GET("/t/{tid}")
    Observable<Response> getForumDetail(@Path("tid") String tid);

    @GET("/api/topics/show.json?id={tid}")
    Observable<Response> getForumDetailByApi(@Path("tid") String tid);

    @GET("/signin")
    Observable<Response> getOnce();

    @FormUrlEncoded
    @POST("/signin")
    Observable<Response> login(@Field("next") String next, @Field("u") String username, @Field("password") String password, @Field("once") String once);

    @FormUrlEncoded
    @POST("/new")
    Observable<Response> newThread(@Field("titile") String title, @Field("content") String content, @Field("node_name") String nodeName, @Field("once") String once);

    @GET("/new")
    Observable<Response> getOnceByThread();

    @POST("/t/{uid}")
    Observable<Response> postReply(@Path("uid") String uid, @Field("content") String content, @Field("once") String once);
*/

}