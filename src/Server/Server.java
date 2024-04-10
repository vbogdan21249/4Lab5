package Server;

import java.util.ArrayList;
import java.util.List;

import States.ServerStates.*;
import States.TCPConnectionState;
import Server.ClientHandler.*;

public class Server {
    private TCPConnectionState state;
    private final List<ClientHandler> clients;
    public Server() {
        this.state = new ServerClosedState(this);
        this.clients = new ArrayList<>();
    }

    public void setState(TCPConnectionState state) {
        this.state = state;
    }

    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }

    public void listen() {
        state.listen();
    }

    public void establish() {
        state.establish();
    }

    public synchronized void addClient(ClientHandler client) {
        clients.add(client);
        establish();
    }

    public synchronized void removeClient(ClientHandler client) {
        clients.remove(client);
        if (clients.isEmpty()) {
            close();
        }
    }

}

