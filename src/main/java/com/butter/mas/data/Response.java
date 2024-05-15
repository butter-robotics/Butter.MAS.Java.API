package com.butter.mas.data;

public class Response {
    String mStatusText;
    ResponseData mData;
    int mStatus;

    public Response(ResponseData data, String statusText, int status) {
        this.mData = data;
        this.mStatus = status;
        this.mStatusText = statusText;
    }

    private Response() {}

    public ResponseData getData() {
        return mData;
    }

    public void setData(ResponseData data) {
        this.mData = data;
    }

    public int getStatus() {
        return mStatus;
    }

    public void setStatus(int status) {
        this.mStatus = status;
    }

    public String getStatusText() {
        return mStatusText;
    }

    public void setStatusText(String statusText) {
        this.mStatusText = statusText;
    }
}
