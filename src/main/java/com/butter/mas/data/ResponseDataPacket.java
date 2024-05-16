package com.butter.mas.data;

public class ResponseDataPacket {
    private String mStatus;
    private Object mData; // Use Object to accommodate both List<ResponseDataPacket> and String
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
