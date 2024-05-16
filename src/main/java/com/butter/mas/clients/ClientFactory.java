package com.butter.mas.clients;

/**
 * Client factory for different types of protocols
 */
public class ClientFactory {

    /**
     * Creates new client
     *
     * @param ip robot IP
     * @param port robot port
     * @param protocol communication protocol
     * @return requested client
     */
    public Object getClient(String ip, Integer port, String protocol) {
        if (protocol == null || protocol.equals("http")) {
            return (port != null) ? new ClientHttp(ip, port) : new ClientHttp(ip);
        } else if (protocol.equals("tcp")) {
            throw new UnsupportedOperationException("Not Implemented");
            // return (port != null) ? new TcpClient(ip, port) : new ClientTcp(ip);
        } else if (protocol.equals("udp")) {
            throw new UnsupportedOperationException("Not Implemented");
            // return (port != null) ? new UdpClient(ip, port) : new ClientUdp(ip);
        } else {
            return null;
        }
    }

    /**
     * Get client class
     *
     * @param protocol communication protocol
     * @return implementation of Client abstract class
     */
    public Class<?> getClientClass(String protocol) {
        if (protocol == null || protocol.equals("http")) {
            return ClientHttp.class;
        } else if (protocol.equals("tcp")) {
            throw new UnsupportedOperationException("Not Implemented");
            // return ClientTcp.class;
        } else if (protocol.equals("udp")) {
            throw new UnsupportedOperationException("Not Implemented");
            // return ClientUdp.class;
        } else {
            return null;
        }
    }
}
