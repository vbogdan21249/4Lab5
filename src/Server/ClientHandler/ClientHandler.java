package Server.ClientHandler;

import Server.Server;
import States.ServerStates.ServerEstablishedState;
import States.TCPConnectionState;

public class ClientHandler extends Thread {
    private final Server server;
    public ClientHandler(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        // Simulate client connection and interaction
        try {
            sleep(1000); // Simulating connection delay
            server.addClient(this);
            sleep(2000); // Simulating client interaction
            server.removeClient(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
