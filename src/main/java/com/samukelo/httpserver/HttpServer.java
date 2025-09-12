package com.samukelo.httpserver;

import com.samukelo.httpserver.config.Configuration;
import com.samukelo.httpserver.config.ConfigurationManager;

//Driver class for http server
public class HttpServer {
    public static void main(String[] args) {
        System.out.println("Server starting...");
        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        System.out.println("Port: "+ conf.getPort());
        System.out.println("Webroot: " + conf.getWebroot());
    }
}
