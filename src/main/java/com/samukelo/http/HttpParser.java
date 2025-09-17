package com.samukelo.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


//Class to parse requests
public class HttpParser {

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpParser.class);

    public void parseHttpRequest(InputStream inputStream){

        InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.US_ASCII);
        parseRequestLine(inputStream);
        parseHeaders(inputStream);
        parseBody(inputStream);


    }
}
