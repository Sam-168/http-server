package com.samukelo.httpserver.core;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerListenerThread extends Thread{

    private int port;
    private String webroot;
    private ServerSocket serverSocket;
    public ServerListenerThread(int port, String webroot) throws IOException {
        this.port = port;
        this.webroot = webroot;
        this.serverSocket = new ServerSocket(this.port);
    }


    @Override
    public void run(){
        super.run();

    }
}
