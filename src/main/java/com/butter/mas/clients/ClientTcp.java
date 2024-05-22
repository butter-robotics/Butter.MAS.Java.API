package com.butter.mas.clients;

/**
 * Butter MAS TCP client API
 */
public class ClientTcp extends Client {

    /**
     * Creates an instance of TcpClient.
     *
     * @param ip        robot ip
     */
    public ClientTcp(String ip) {
        this(ip, 3003);
    }

    /**
     * Creates an instance of TcpClient.
     *
     * @param ip        robot ip
     * @param port      robot port
     */
    public ClientTcp(String ip, int port) {
        super(ip, port, "tcp");
    }
}