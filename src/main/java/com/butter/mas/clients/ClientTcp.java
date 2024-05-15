package com.butter.mas.clients;

/**
 * Butter MAS TCP client API
 *
 * @class ClientTcp
 * @extends Client
 */
public class ClientTcp extends Client {

    /**
     * Creates an instance of TcpClient.
     *
     * @param ip        robot ip
     * @param port      robot port
     * @param protocol  communication protocol
     */
    public ClientTcp(String ip, int port, String protocol) {
        super(ip, port, protocol);
    }

    public ClientTcp(String ip) {
        this(ip, 3003, "tcp");
    }

    public ClientTcp(String ip, int port) {
        this(ip, port, "tcp");
    }
}