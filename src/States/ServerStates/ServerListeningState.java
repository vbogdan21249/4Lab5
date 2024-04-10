package States.ServerStates;

import Server.Server;
import States.TCPConnectionState;

public class ServerListeningState implements TCPConnectionState {
    private final Server server;

    public ServerListeningState(Server server) {
        this.server = server;
    }

    @Override
    public void open() {
        // ALREADY OPENED
    }

    @Override
    public void close() {
        // ALREADY CLOSED
    }

    @Override
    public void listen() {
        // NOT APPLICABLE
    }

    @Override
    public void establish() {
        server.setState(new ServerEstablishedState(server));
        System.out.println("Server connection established.");
    }
}
