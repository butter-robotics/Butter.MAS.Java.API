package com.butter.mas.clients;

/**
 * Butter MAS UDP client API
 */
public class ClientUdp extends Client {

    /**
     * Creates an instance of UdpClient.
     *
     * @param ip        robot ip
     */
    public ClientUdp(String ip) {
        this(ip, 3030);
    }

    /**
     * Creates an instance of UdpClient.
     *
     * @param ip        robot ip
     * @param port      robot port
     */
    public ClientUdp(String ip, int port) {
        super(ip, port, "udp");
    }
}