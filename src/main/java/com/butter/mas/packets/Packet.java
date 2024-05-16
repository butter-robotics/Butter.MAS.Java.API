package com.butter.mas.packets;

import com.butter.mas.data.*;

/**
 * Represents an abstract data packet
 */
public abstract class Packet {
    protected String mIp;
    protected int mPort;
    protected String mQuery;

    /**
     * Creates an instance of Packet.
     *
     * @param ip    robot IP
     * @param port  robot port
     * @param query packet payload
     */
    public Packet(String ip, int port, String query) {
        this.mIp = ip;
        this.mPort = port;
        this.mQuery = query;
    }

    /**
     * Send packet abstract method
     *
     * @param timeout packet timeout (optional)
     */
    public Response send(Integer timeout) {
        throw new UnsupportedOperationException("Not Implemented");
    }

    /**
     * Generates structured response
     *
     * @param content response content
     * @return structured response
     */
    protected Response generateResponse(ResponseData content) {
        return new Response(content, "OK", 200);
    }

    /**
     * Generates empty response packet
     *
     * @param error     error
     * @param errorType error type
     * @return error response
     */
    protected Response generateEmptyResponse(Object error, String errorType) {
        if (errorType == null) {
            errorType = "unknown";
        }

        String exception = String.format("Request resolved with an %s error. %s.",
                errorType, error != null ? error.toString() : "Unknown error");
        MetadataDataPacket metadata = new MetadataDataPacket("unknown", exception, false,0 ,0);
        RequestDataPacket requestDataPacket = new RequestDataPacket("", null);
        ResponseDataPacket responseDataPacket = new ResponseDataPacket("Failed", null, metadata);
        ResponseData responseData = new ResponseData(requestDataPacket, responseDataPacket, false);
        Response response = new Response(responseData, "Failed", 400);

        return response;
    }

    /**
     * Generates empty response packet
     *
     * @return error response
     */
    protected Response generateEmptyResponse() {
        return generateEmptyResponse(null, "unknown");
    }

    /**
     * Compares this packet to another packet
     *
     * @param other the other packet
     * @return true if they are equal, false otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;

        Packet packet = (Packet) other;
        return mPort == packet.mPort && mIp.equals(packet.mIp) && mQuery.equals(packet.mQuery);
    }

    @Override
    public int hashCode() {
        int result = mIp.hashCode();
        result = 31 * result + mPort;
        result = 31 * result + mQuery.hashCode();

        return result;
    }
}
