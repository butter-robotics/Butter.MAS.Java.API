package com.butter.mas.data;

import org.jetbrains.annotations.Nullable;

public class MetadataDataPacket {

    String mHandler;
    String mException;
    boolean mAsynchronous;
    long mTimestamp;
    long mDuration;

    public MetadataDataPacket(String handler, String exception, boolean asynchronous, long timestamp, long duration) {
        this.mHandler = handler;
        this.mException = exception;
        this.mAsynchronous = asynchronous;
        this.mTimestamp = timestamp;
        this.mDuration = duration;
    }

    private MetadataDataPacket() {}

    String getHandler() {
        return null;
    }

    void setHandler(String handler) {
        this.mHandler = handler;
    }

    Boolean getAsynchronous() {
        return this.mAsynchronous;
    }

    void setAsynchronous(@Nullable Boolean asynchronous) {
        if (asynchronous != null) {
            this.mAsynchronous = asynchronous;
        }
    }

    String getException() {
        return this.mException;
    }

    void setException(@Nullable String exception) {
        if (exception != null) {
            this.mException = exception;
        }
    }

    long getTimestamp() {
        return this.mTimestamp;
    }

    void setTimestamp(long timestamp) {
        this.mTimestamp = timestamp;
    }

    long getDuration() {
        return this.mDuration;
    }

    void setDuration(long duration) {
        this.mDuration = duration;
    }

    @Override
    public String toString() {
        return "MetadataDataPacket{" +
                "mHandler='" + mHandler + '\'' +
                ", mException='" + mException + '\'' +
                ", mAsynchronous=" + mAsynchronous +
                ", mTimestamp=" + mTimestamp +
                ", mDuration=" + mDuration +
                '}';
    }
}
