package com.samukelo.http;

public enum HttpMethod {
    //Defining GET and HEAD
    GET, HEAD;
    public static final int MAX_LENGTH;

    static {
        int tempMaxLength = -1;
        for (HttpMethod method : values()){
            if (method.name().length() > tempMaxLength){
                tempMaxLength = method.name().length();
            }
        }
        MAX_LENGTH = tempMaxLength;
    }
}
