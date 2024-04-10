package States.ServerStates;

import Server.Server;
import States.TCPConnectionState;

public class ServerEstablishedState implements TCPConnectionState {
    private final Server server;

    public ServerEstablishedState(Server server) {
        this.server = server;
    }

    @Override
    public void open() {
        // ALREADY OPENED
    }

    @Override
    public void close() {
        server.setState(new ServerClosedState(server));
        System.out.println("Server connection closed.");
    }

    @Override
    public void listen() {
        // NOT APPLICABLE
    }

    @Override
    public void establish() {
        // ALREADY ESTABLISHED
    }
}
