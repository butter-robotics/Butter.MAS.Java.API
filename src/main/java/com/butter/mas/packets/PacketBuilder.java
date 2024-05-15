package com.butter.mas.packets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Builds a command packet using the builder design pattern
 *
 * @class PacketBuilder
 */
public class PacketBuilder {
    private final String mIp;
    private final int mPort;
    private final Class<?> mPacket;

    private String mCommand;
    private final List<String> mArguments;
    private final List<String> mParameters;
    private final Map<String, String> mKeys;

    /**
     * Creates an instance of PacketBuilder.
     *
     * @param ip       robot IP
     * @param port     robot port
     * @param protocol communication protocol
     */
    public PacketBuilder(String ip, int port, String protocol) {
        this.mIp = ip;
        this.mPort = port;

        PacketFactory packetFactory = new PacketFactory();
        this.mPacket = packetFactory.getPacketClass(protocol);

        this.mCommand = null;
        this.mArguments = new ArrayList<>();
        this.mParameters = new ArrayList<>();
        this.mKeys = new HashMap<>();
    }

    /**
     * Add command
     *
     * @param command the command
     * @return this PacketBuilder
     */
    public PacketBuilder addCommand(String command) {
        this.mCommand = command;
        return this;
    }

    /**
     * Add argument
     *
     * @param argument the argument
     * @return this PacketBuilder
     */
    public PacketBuilder addArgument(Object argument) {
        this.mArguments.add(argument.toString());
        return this;
    }

    /**
     * Add arguments
     *
     * @param arguments the arguments
     * @return this PacketBuilder
     */
    public PacketBuilder addArguments(Object... arguments) {
        if (arguments != null) {
            for (Object argument : arguments) {
                this.mArguments.add(argument.toString());
            }
        }
        return this;
    }

    /**
     * Add parameter
     *
     * @param parameter the parameter
     * @return this PacketBuilder
     */
    public PacketBuilder addParameter(String parameter) {
        this.mParameters.add(formatParameter(parameter));
        return this;
    }

    /**
     * Add parameters
     *
     * @param parameters the parameters
     * @return this PacketBuilder
     */
    public PacketBuilder addParameters(String... parameters) {
        if (parameters != null) {
            for (String parameter : parameters) {
                this.mParameters.add(formatParameter(parameter));
            }
        }
        return this;
    }

    /**
     * Add key value pair
     *
     * @param key   the key
     * @param value the value
     * @return this PacketBuilder
     */
    public PacketBuilder addKeyValuePair(String key, Object value) {
        if (value != null) {
            this.mKeys.put(key, value.toString());
        }
        return this;
    }

    /**
     * Formats parameter properly
     *
     * @param parameter the parameter
     * @return formatted parameter
     */
    private String formatParameter(String parameter) {
        String normalizedParameter = parameter;
        if (!parameter.startsWith("--")) {
            if (parameter.startsWith("-")) {
                normalizedParameter = "-" + parameter;
            } else {
                normalizedParameter = "--" + parameter;
            }
        }
        return normalizedParameter;
    }

    /**
     * Builds the packet
     *
     * @return data packet
     */
    public Packet build() {
        if (this.mCommand == null) {
            return null;
        }

        StringBuilder query = new StringBuilder(this.mCommand + "?");

        if (!this.mArguments.isEmpty()) {
            query.append(String.join("&", this.mArguments)).append("&");
        }

        if (!this.mParameters.isEmpty()) {
            List<String> formattedParams = new ArrayList<>();
            for (String param : this.mParameters) {
                formattedParams.add(formatParameter(param));
            }
            query.append(String.join("&", formattedParams)).append("&");
        }

        if (!this.mKeys.isEmpty()) {
            List<String> keyValuePairs = new ArrayList<>();
            for (Map.Entry<String, String> entry : this.mKeys.entrySet()) {
                keyValuePairs.add(entry.getKey() + "=" + entry.getValue());
            }
            query.append(String.join("&", keyValuePairs));
        }

        String uri = "api/robots/any/command/" + query.toString().replaceAll("&+$", "");

        try {
            return (Packet)this.mPacket.getConstructor(String.class, int.class, String.class)
                    .newInstance(this.mIp, this.mPort, uri);
        } catch (Exception e) {
            throw new RuntimeException("Failed to build packet", e);
        }
    }
}
