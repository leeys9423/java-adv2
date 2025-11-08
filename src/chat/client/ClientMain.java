package chat.client;

import java.io.IOException;

public class ClientMain {

    private static final int PORT = 1234;

    public static void main(String[] args) throws IOException {
        Client client = new Client("localhost", PORT);
        client.start();
    }
}
