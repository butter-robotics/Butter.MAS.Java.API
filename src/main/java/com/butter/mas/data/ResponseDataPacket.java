package com.butter.mas.data;

import com.google.gson.annotations.SerializedName;

public class ResponseDataPacket {
    @SerializedName("id")
    private String mId;
    
    @SerializedName("status")
    private String mStatus;

    @SerializedName("data")
    private Object mData; // Use Object to accommodate both List<ResponseDataPacket> and String

    @SerializedName("metadata")
    private MetadataDataPacket mMetadata;

    public ResponseDataPacket(String status, Object data, MetadataDataPacket metadata) {
        this.mStatus = status;
        this.mData = data;
        this.mMetadata = metadata;
    }

    private ResponseDataPacket() {
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        this.mStatus = status;
    }

    public Object getData() {
        return mData;
    }

    public void setData(Object data) {
        this.mData = data;
    }

    public MetadataDataPacket getMetadata() {
        return mMetadata;
    }

    public void setMetadata(MetadataDataPacket metadata) {
        this.mMetadata = metadata;
    }

    @Override
    public String toString() {
        return "ResponseDataPacket{" +
                "mStatus='" + mStatus + '\'' +
                ", mData=" + mData +
                ", mMetadata=" + mMetadata +
                '}';
    }
}
