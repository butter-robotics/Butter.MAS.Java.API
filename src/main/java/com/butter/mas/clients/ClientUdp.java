package com.butter.mas.clients;

/**
 * Butter MAS UDP client API
 */
public class ClientUdp extends Client {

    /**
     * Creates an instance of UdpClient.
     *
     * @param ip        robot ip
     * @param port      robot port
     * @param protocol  communication protocol
     */
    public ClientUdp(String ip, int port, String protocol) {
        super(ip, port, protocol);
    }

    public ClientUdp(String ip) {
        this(ip, 3030, "udp");
    }

    public ClientUdp(String ip, int port) {
        this(ip, port, "udp");
    }
}