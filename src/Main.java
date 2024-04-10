import Server.*;
import Client.*;
import Server.ClientHandler.ClientHandler;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        server.open();

        for (int i = 0; i < 3; i++) {
            ClientHandler client = new ClientHandler(server);
            client.start();
        }
    }
}