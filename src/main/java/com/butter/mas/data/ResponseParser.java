package com.butter.mas.data;

import com.google.gson.Gson;

public class ResponseParser {
    private static final Gson mGsonParser = new Gson();

    /**
     * Parse response string into Response object
     * @param response response JSON string
     * @return Response object
     */
    public static Response parse(String response) {
        return mGsonParser.fromJson(response, Response.class);
    }
}
