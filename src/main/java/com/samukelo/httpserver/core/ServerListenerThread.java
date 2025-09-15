package com.samukelo.httpserver.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

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
        try {

            Socket socket = serverSocket.accept(); //prompts a socket to accept a connection(listening to a port)

            InputStream inputStream = socket.getInputStream();//Reading something from the socket(get Input Stream)
            OutputStream outputStream = socket.getOutputStream(); //write to socket

            //Reading

            //Writing
            String html = "<html><head><title>Java HTTP server</title></head><body><h1>Can you believe it?<br>Sam's own http server!</h1></body></html>";

            final String CRLF = "\r\n"; //13, 10 ASCII
            String response =
                    "HTTP/1.1 200 OK" + CRLF +
                            "Content Length: " + html.getBytes().length + CRLF +
                            CRLF + html + CRLF + CRLF;//Status line(response) : HTTP VERSION RESPONSE CODE RESPONSE MESSAGE

            outputStream.write(response.getBytes()); //Writing to output stream in bytes



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
