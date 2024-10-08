package de.voasis.serverHandlerProxy.Maps;

import com.velocitypowered.api.command.CommandSource;

public class BackendServer {
    private String holdServer;
    private int port;
    private String serverName;
    private boolean online;
    private CommandSource creator;

    public BackendServer(String name, String holdServer, int port, boolean online, CommandSource creator) {
        this.serverName = name;
        this.port = port;
        this.holdServer = holdServer;
        this.online = online;
        this.creator = creator;
    }
    public String getServerName() {
        return serverName;
    }
    public int getPort() {
        return port;
    }
    public String getHoldServer() {
        return holdServer;
    }
    public boolean getState() {
        return online;
    }
    public CommandSource getCreator() {
        return creator;
    }
    public void setState(boolean online) {
        this.online = online;
    }
}
