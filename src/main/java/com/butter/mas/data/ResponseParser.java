package com.butter.mas.data;

import com.google.gson.Gson;

public class ResponseParser {
    private static final Gson mGsonParser = new Gson();

    /**
     * Parse response string into Response object
     * @param response response JSON string
     * @return Response object
     */
    public static Response parse(String response, int status) {
        String statusString = status < 0 ? "UNKNOWN" :
                status >= 200 && status < 400 ? "OK" : "Failed";
        ResponseData responseData = mGsonParser.fromJson(response, ResponseData.class);

        return new Response(responseData, statusString, status);
    }
}
