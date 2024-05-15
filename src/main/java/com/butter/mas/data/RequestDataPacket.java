package com.butter.mas.data;

import java.util.List;

public class RequestDataPacket {
    private String mQuery;
    private List<String> mParameters;

    public RequestDataPacket(String query, List<String> parameters) {
        this.mQuery = query;
        this.mParameters = parameters;
    }

    private RequestDataPacket() {
    }

    public String getQuery() {
        return mQuery;
    }

    public void setQuery(String query) {
        this.mQuery = query;
    }

    public List<String> getParameters() {
        return mParameters;
    }

    public void setParameters(List<String> parameters) {
        this.mParameters = parameters;
    }
}
