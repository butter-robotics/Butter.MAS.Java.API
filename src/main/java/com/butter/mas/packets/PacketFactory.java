package com.butter.mas.packets;

/**
 * Packet factory for different types of protocols
 *
 * @class PacketFactory
 */
public class PacketFactory {

    /**
     * Creates new client
     *
     * @param ip       robot IP
     * @param port     robot port
     * @param query    packet data
     * @param protocol communication protocol
     * @return requested client
     */
    public Object getPacket(String ip, int port, String query, String protocol) {
        if (protocol == null) {
            protocol = "http";
        }

        switch (protocol) {
            case "http":
                return new PacketHttp(ip, port, query);
            case "tcp":
                throw new UnsupportedOperationException("Not Implemented");
                // return new TcpPacket(ip, port, query); // Uncomment when implemented
            case "udp":
                throw new UnsupportedOperationException("Not Implemented");
                // return new UdpPacket(ip, port, query); // Uncomment when implemented
            default:
                return null;
        }
    }

    /**
     * Get packet class
     *
     * @param protocol communication protocol
     * @return implementation of Packet abstract class
     */
    public Class<?> getPacketClass(String protocol) {
        if (protocol == null) {
            protocol = "http";
        }

        switch (protocol) {
            case "http":
                return PacketHttp.class;
            case "tcp":
                throw new UnsupportedOperationException("Not Implemented");
                // return TcpPacket.class; // Uncomment when implemented
            case "udp":
                throw new UnsupportedOperationException("Not Implemented");
                // return UdpPacket.class; // Uncomment when implemented
            default:
                return null;
        }
    }
}

