package com.butter.mas.clients;

/**
 * Butter MAS HTTP client API
 */
public class ClientHttp extends Client {

    /**
     * Creates an instance of HttpClient.
     *
     * @param ip        robot ip
     * @param port      robot port
     * @param protocol  communication protocol
     */
    public ClientHttp(String ip, int port, String protocol) {
        super(ip, port, protocol);
    }

    public ClientHttp(String ip) {
        this(ip, 3000, "http");
    }

    public ClientHttp(String ip, int port) {
        this(ip, port, "http");
    }
}

