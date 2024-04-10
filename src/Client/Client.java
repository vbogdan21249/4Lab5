package Client;

import States.TCPConnectionState;
import States.ClientStates.*;

public class Client {
    private TCPConnectionState state;

    public Client() {
        this.state = new ClientClosedState(this);
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
}
