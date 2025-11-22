package com.tripian.trpfoundationkit;

public class BaseUrlCreator {

    private String baseUrl;
    private String basePath;

    public BaseUrlCreator(String baseUrl, String basePath) {
        this.baseUrl = baseUrl;
        this.basePath = basePath;
    }

    public String getUrl(){
        return baseUrl + "/" + basePath;
    }
}
