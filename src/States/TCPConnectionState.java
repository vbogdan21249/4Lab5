package States;

public interface TCPConnectionState {
    void open();
    void close();
    void listen();
    void establish();
}
