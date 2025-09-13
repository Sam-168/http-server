package com.samukelo.httpserver;

import com.samukelo.httpserver.config.Configuration;
import com.samukelo.httpserver.config.ConfigurationManager;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Driver class for http server
public class HttpServer {
    public static void main(String[] args) {
        System.out.println("Server starting...");
        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        System.out.println("Port: "+ conf.getPort());
        System.out.println("Webroot: " + conf.getWebroot());

        //A server socket that is going to listen to a specific port
        try {
            ServerSocket serverSocket = new ServerSocket(conf.getPort());
           Socket socket = serverSocket.accept(); //prompts a socket to accept a connection(listening to a port)

            InputStream inputStream = socket.getInputStream();//Reading something from the socket(get Input Stream)
            OutputStream outputStream = socket.getOutputStream(); //write to socket

            //Reading

            //Writing
            String html = "<html><head><title>Java HTTP server</title></head><body><h1>Can you believe it?My own http server!</h1></body></html>";

            String response =
                    "HTTP/1.1 200 OK";//Status line(response) : HTTP VERSION RESPONSE CODE RESPONSE MESSAGE



            //Closing resources
            inputStream.close();
            outputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
