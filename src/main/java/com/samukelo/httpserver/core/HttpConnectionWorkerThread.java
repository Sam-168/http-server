package com.samukelo.httpserver.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//Firing up more http connections
public class HttpConnectionWorkerThread extends Thread{
    private Socket socket;
    private final static Logger LOGGER = LoggerFactory.getLogger(HttpConnectionWorkerThread.class);

    public HttpConnectionWorkerThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = socket.getInputStream();//Reading something from the socket(get Input Stream)
            outputStream = socket.getOutputStream(); //write to socket

            //Reading

            //Writing
            String html = "<html><head><title>Java HTTP server</title></head><body><h1>Can you believe it?<br>Sam's own http server!</h1></body></html>";

            final String CRLF = "\r\n"; //13, 10 ASCII
            String response =
                    "HTTP/1.1 200 OK" + CRLF +
                            "Content Length: " + html.getBytes().length + CRLF +
                            CRLF + html + CRLF + CRLF;//Status line(response) : HTTP VERSION RESPONSE CODE RESPONSE MESSAGE

            outputStream.write(response.getBytes()); //Writing to output stream in bytes

            LOGGER.info(" Connection Processing Finished." + socket.getInetAddress());


        } catch (IOException e) {
            LOGGER.error("Problem with communication ", e);
        }finally {
            //Closing resources
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {}
            }
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {}
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {}
            }

        }
    }
}
