package com.samukelo.http;

public enum HttpVersion {
    HTTP_1_1("HTTP/1.1", 1, 1);
//code to create http version
    public final String LITERAL;
    public final int MAJOR;
    public final int MINOR;

    HttpVersion(String LITERAL, int MAJOR, int MINOR) {
        this.LITERAL = LITERAL;
        this.MAJOR = MAJOR;
        this.MINOR = MINOR;
    }
}
