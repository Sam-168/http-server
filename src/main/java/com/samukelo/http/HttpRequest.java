package com.samukelo.http;

public class HttpRequest extends HttpMessage{
    private String method;
    private String requestTarget;
    private String httpVersion;

    public String getMethod() {
        return method;
    }

    void setMethod(String method) {
        this.method = method;
    }

    HttpRequest(){

    }

}
