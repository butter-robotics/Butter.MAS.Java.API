package com.butter.mas.clients;

/**
 * Butter MAS HTTP client API
 */
public class ClientHttp extends Client {
    /**
     * Creates an instance of HttpClient.
     *
     * @param ip        robot ip
     */
    public ClientHttp(String ip) {
        this(ip, 3000);
    }

    /**
     * Creates an instance of HttpClient.
     *
     * @param ip        robot ip
     * @param port      robot port
     */
    public ClientHttp(String ip, int port) {
        super(ip, port, "http");
    }
}

