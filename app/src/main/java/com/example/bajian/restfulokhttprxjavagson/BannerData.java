package com.example.bajian.restfulokhttprxjavagson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ihgoo on 2015/2/5.
 */
public class BannerData {

    @SerializedName("banner_name")
    @Expose
    private String bannerName = "";
    @SerializedName("banner_url")
    @Expose
    private String bannerUrl = "";
    @SerializedName("pic_path")
    @Expose
    private String picPath = "";

    @Override
    public String toString() {
        return "{\"banner_name\":\""+ bannerName +"\",\"banner_url\":\""+bannerUrl+"\",\"pic_path\":\""+picPath+"\"}";
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}