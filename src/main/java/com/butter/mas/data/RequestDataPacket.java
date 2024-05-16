package com.butter.mas.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RequestDataPacket {
    @SerializedName("query")
    private String mQuery;

    @SerializedName("parameters")
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

    @Override
    public String toString() {
        return "RequestDataPacket{" +
                "mQuery='" + mQuery + '\'' +
                ", mParameters=" + mParameters +
                '}';
    }
}
