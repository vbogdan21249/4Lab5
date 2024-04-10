package States.ClientStates;

import Client.*;
import States.TCPConnectionState;

public class ClientClosedState implements TCPConnectionState {
    private final Client client;

    public ClientClosedState(Client client) {
        this.client = client;
    }
    @Override
    public void open() {
        client.setState(new ClientEstablishedState(client));
        System.out.println("Client connection established.");
    }

    @Override
    public void close() {
        //  ALREADY CLOSED
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
