package com.butter.mas.packets;

import com.butter.mas.data.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * Represents a HTTP data packet
 *
 * @class PacketHttp
 * @extends Packet
 */
public class PacketHttp extends Packet {
    /**
     * Creates an instance of PacketHttp.
     *
     * @param ip    robot IP
     * @param port  robot port
     * @param query packet payload
     */
    public PacketHttp(String ip, int port, String query) {
        super(ip, port, query);
    }

    /**
     * Send packet
     *
     * @param timeout packet timeout (optional)
     * @return response containing the response
     */
    public Response send(int timeout) {
        HttpURLConnection connection = null;
        Response response = null;

        try {
            URL url = new URL("http://" + this.mIp + ":" + this.mPort + "/" + this.mQuery);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(timeout);
            connection.setReadTimeout(timeout);

            int status = connection.getResponseCode();
            Scanner scanner = new Scanner(connection.getInputStream());
            String responseBody = scanner.useDelimiter("\\A").next();
            scanner.close();

            response = ResponseParser.parse(responseBody);

        } catch (IOException e) {
            System.err.println("Warning: request failed.\n" + e + "\n");
            response = generateEmptyResponse(null, e.getMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return response;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof PacketHttp that)) return false;

        return this.mIp.equals(that.mIp) && this.mPort == that.mPort && this.mQuery.equals(that.mQuery);
    }
}
