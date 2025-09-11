package com.samukelo.httpserver.config;
//This will be the file we will map the json to
public class Configuration {
   private int port;
    private String webroot;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getWebroot() {
        return webroot;
    }

    public void setWebroot(String webroot) {
        this.webroot = webroot;
    }
}
