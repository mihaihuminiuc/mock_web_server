package com.boraji.tutorial.spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageModel {

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTmbUrl() {
        return tmbUrl;
    }

    public void setTmbUrl(String tmbUrl) {
        this.tmbUrl = tmbUrl;
    }

    @JsonProperty("img_url")
    private String imgUrl;

    @JsonProperty("tmp_url")
    private String tmbUrl;

}
