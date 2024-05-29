package com.butter.mas.data;

import com.google.gson.Gson;

public class ResponseParser {
    private static final Gson mGsonParser = new Gson();

    /**
     * Parse response string into Response object
     * @param response response JSON string
     * @param status response status code
     * @return Response object
     */
    public static Response parse(String response, int status) {
        String statusText = status < 0 ? "Unknown" :
                status >= 200 && status < 400 ? "OK" : "Failed";
        ResponseData responseData = mGsonParser.fromJson(response, ResponseData.class);

        return new Response(responseData, statusText, status);
    }
}
