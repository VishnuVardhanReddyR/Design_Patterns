package strategy.solution;

public class ChatClient {
    private Encryption encryption;

    public void send(Encryption encryption) {
        encryption.send();
    }
}
