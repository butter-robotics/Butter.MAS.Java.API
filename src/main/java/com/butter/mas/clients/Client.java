package com.butter.mas.clients;

import com.butter.mas.data.Response;
import com.butter.mas.data.RotationUnits;
import com.butter.mas.packets.Packet;
import com.butter.mas.packets.PacketBuilder;

import java.util.List;

public class Client {
    private int mTimeout;
    private final String mIp;
    private final int mPort;
    private final String mProtocol;

    /**
     * Creates an instance of Client.
     *
     * @param ip       IP address of the client.
     * @param port     Port number, defaults to 3000.
     * @param protocol Protocol, defaults to "http".
     */
    public Client(String ip, int port, String protocol) {
        this.mTimeout = 40;
        this.mIp = ip;
        this.mPort = (port != 0) ? port : 3000;
        this.mProtocol = (protocol != null) ? protocol : "http";
    }

    public Client(String ip) {
        this(ip, 3000, "http");
    }

    /**
     * Get command execution timeout (in milliseconds)
     *
     * @return Timeout in milliseconds.
     */
    public int getTimeout() {
        return mTimeout;
    }

    /**
     * Set time for the command execution
     *
     * @param timeout Command execution timeout in milliseconds.
     */
    public void setTimeout(int timeout) {
        if (timeout < 20 || timeout > 500) {
            throw new IllegalArgumentException("Timeout must be an integer number in the range [20, 500]");
        }
        this.mTimeout = timeout;
    }

    /**
     * Get available robot handlers
     *
     * @return Response containing all the available robot handlers.
     */
    public Response getAvailableHandlers() {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol).addCommand("list").build();
        return packet.send(mTimeout);
    }

    /**
     * Get available (loaded) robot animations
     *
     * @param reload Reload animations if true.
     * @return Response containing all the available (loaded) robot animations.
     */
    public Response getAvailableAnimations(boolean reload) {
        PacketBuilder builder = new PacketBuilder(mIp, mPort, mProtocol).addCommand("animate");

        if (reload) {
            builder.addParameter("reload");
        }

        Packet packet = builder.addParameter("list").build();
        return packet.send(mTimeout);
    }

    /**
     * Get available (loaded) robot sound assets
     *
     * @param reload Reload sound assets if true.
     * @return Response containing all the available (loaded) robot sound assets.
     */
    public Response getAvailableSounds(boolean reload) {
        PacketBuilder builder = new PacketBuilder(mIp, mPort, mProtocol).addCommand("audio");

        if (reload) {
            builder.addParameter("reload");
        }

        Packet packet = builder.addParameter("list").build();
        return packet.send(mTimeout);
    }

    /**
     * Get all available motor registers (for Dynamixel motors only)
     *
     * @param motorName   Motor name (as configured on the configurator).
     * @param readableOnly Get readable registers only if true.
     * @return Response containing all the available motor registers.
     */
    public Response getAvailableMotorRegisters(String motorName, boolean readableOnly) {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("dxl")
                .addArguments("get", motorName)
                .addParameter("list")
                .addKeyValuePair("readableOnly", readableOnly)
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Get motor register value (for Dynamixel motors only)
     *
     * @param motorName    Motor name (as configured on the configurator).
     * @param registerName Register name.
     * @return Response containing register value.
     */
    public Response getMotorRegister(String motorName, String registerName) {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("dxl")
                .addArguments("get", motorName, registerName)
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Get motor register value range (for Dynamixel motors only)
     *
     * @param motorName    Motor name (as configured on the configurator).
     * @param registerName Register name.
     * @return Response containing register range value.
     */
    public Response getMotorRegisterRange(String motorName, String registerName) {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("dxl")
                .addArguments("get", motorName, registerName)
                .addParameter("range")
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Set motor register value (for Dynamixel motors only)
     *
     * @param motorName    Motor name (as configured on the configurator).
     * @param registerName Register name.
     * @param value        Value to set.
     * @return Response containing execution result.
     */
    public Response setMotorRegister(String motorName, String registerName, String value) {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("dxl")
                .addArguments("set", motorName, registerName, value)
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Move motor to a certain position (relative to the motor's zero position)
     *
     * @param motorName    Motor name (as configured on the configurator).
     * @param position     Motor final position (in units).
     * @param velocity     Motor movement speed (in units / sec).
     * @param acceleration Motor maximal acceleration (in units / sec^2).
     * @param units        Rotation units.
     * @return Response containing execution result.
     */
    public Response moveMotorToPosition(String motorName, int position, Integer velocity, Integer acceleration, RotationUnits units) {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("move")
                .addArguments(motorName, position)
                .addKeyValuePair("velocity", velocity)
                .addKeyValuePair("acceleration", acceleration)
                .addKeyValuePair("units", units.name())
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Move motor to a certain position (relative to the motor's zero position) in fixed duration
     *
     * @param motorName Motor name (as configured on the configurator).
     * @param position  Motor final position (in units).
     * @param duration  Motor movement duration (in milliseconds).
     * @param units     Rotation units.
     * @return Response containing execution result.
     */
    public Response moveMotorInTime(String motorName, int position, int duration, RotationUnits units) {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("move")
                .addArguments(motorName, position)
                .addKeyValuePair("duration", duration)
                .addKeyValuePair("units", units.name())
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Move motor to a certain direction (relative to the motor's current position)
     *
     * @param motorName Motor name (as configured on the configurator).
     * @param direction Motor movement direction (left, right, stop).
     * @param velocity  Motor movement speed (in units / sec).
     * @param units     Rotation units.
     * @return Response containing execution result.
     */
    public Response moveMotorInDirection(String motorName, String direction, Integer velocity, RotationUnits units) {
        int directionCode = direction.equalsIgnoreCase("right") ? 1 : direction.equalsIgnoreCase("left") ? -1 : 0;
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("move")
                .addArguments(motorName, directionCode)
                .addKeyValuePair("velocity", velocity)
                .addKeyValuePair("units", units.name())
                .addParameter("continuously")
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Play animation sequence on the robot
     *
     * @param animationSequence Animation sequence.
     * @param lenient           Wait for current playing animation (if present) to finish.
     * @param relative          Play animation relative to the current robot position.
     * @return Response containing execution result.
     */
    public Response playSequence(List<String> animationSequence, boolean lenient, boolean relative) {
        return this.playAnimation(String.join("", animationSequence).replaceAll("\\s+", ""), lenient, relative);
    }

    /**
     * Play animation on the robot
     *
     * @param animationName Animation name.
     * @param lenient       Wait for current playing animation (if present) to finish.
     * @param relative      Play animation relative to the current robot position.
     * @return Response containing execution result.
     */
    public Response playAnimation(String animationName, boolean lenient, boolean relative) {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("animate")
                .addArgument(animationName)
                .addKeyValuePair("lenient", lenient)
                .addKeyValuePair("relative", relative)
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Observe animation status ['ANIMATING', 'QUEUED', 'STOPPED', 'PAUSED', 'IDLE']
     *
     * @param animationName Animation name (if none provided, will check global status).
     * @return Response containing execution result.
     */
    public Response observeAnimation(String animationName) {
        Packet packet = (animationName != null)
                ? new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("animate")
                .addArgument(animationName)
                .addParameter("status")
                .build()
                : new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("animate")
                .addParameter("status")
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Pause currently playing animation (if available) on the robot
     *
     * @return Response containing execution result.
     */
    public Response pauseAnimation() {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("animate")
                .addParameter("pause")
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Resume currently paused animation (if available) on the robot
     *
     * @return Response containing execution result.
     */
    public Response resumeAnimation() {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("animate")
                .addParameter("resume")
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Stop currently playing animation (if available) on the robot
     *
     * @return Response containing execution result.
     */
    public Response stopAnimation() {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("animate")
                .addParameter("stop")
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Clear animation queue (if present)
     *
     * @return Response containing execution result.
     */
    public Response clearAnimation() {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("animate")
                .addParameter("clear")
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Play audio on the robot
     *
     * @param fileName Audio asset name.
     * @return Response containing execution result.
     */
    public Response playAudio(String fileName) {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("audio")
                .addArgument(fileName)
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Pause current audio playback (if available) on the robot
     *
     * @return Response containing execution result.
     */
    public Response pauseAudio() {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("audio")
                .addParameter("pause")
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Resume currently paused audio playback (if available) on the robot
     *
     * @return Response containing execution result.
     */
    public Response resumeAudio() {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("audio")
                .addParameter("resume")
                .build();

        return packet.send(mTimeout);
    }

    /**
     * Stop current audio playback (if available) on the robot
     *
     * @return Response containing execution result.
     */
    public Response stopAudio() {
        Packet packet = new PacketBuilder(mIp, mPort, mProtocol)
                .addCommand("audio")
                .addParameter("stop")
                .build();

        return packet.send(mTimeout);
    }
}
