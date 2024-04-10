package States.ServerStates;


import Server.Server;
import States.TCPConnectionState;

public class ServerClosedState implements TCPConnectionState {

    private final Server server;

    public ServerClosedState(Server server){
        this.server = server;
    }

    @Override
    public void open() {
        server.setState(new ServerListeningState(server));
        System.out.println("Server is now listening for incoming connections.");
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
        // NOT APPLICABLE
    }
}
