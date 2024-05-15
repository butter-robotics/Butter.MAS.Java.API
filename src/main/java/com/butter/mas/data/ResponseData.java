package com.butter.mas.data;

/**
 * This class should be updated together with @class{ResponseBuilder}
 */
public class ResponseData {
    private RequestDataPacket mRequest;
    private ResponseDataPacket mResponse;
    private Boolean mExecuted;

    public ResponseData(RequestDataPacket request, ResponseDataPacket response, Boolean executed) {
        this.mRequest = request;
        this.mResponse = response;
        this.mExecuted = executed;
    }

    private ResponseData() {
    }

    public RequestDataPacket getRequest() {
        return mRequest;
    }

    public void setRequest(RequestDataPacket request) {
        this.mRequest = request;
    }

    public ResponseDataPacket getResponse() {
        return mResponse;
    }

    public void setResponse(ResponseDataPacket response) {
        this.mResponse = response;
    }

    public Boolean getExecuted() {
        return mExecuted;
    }

    public void setExecuted(Boolean executed) {
        this.mExecuted = executed;
    }
}
