package States.ClientStates;

import Client.Client;
import States.TCPConnectionState;

public class ClientEstablishedState implements TCPConnectionState {
    private final Client client;

    public ClientEstablishedState(Client client) {
        this.client = client;
    }

    @Override
    public void open() {
        // ALREADY OPENED
    }

    @Override
    public void close() {
        client.setState(new ClientClosedState(client));
        System.out.println("Client connection closed.");
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
