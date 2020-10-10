package strategy.solution;

public class AesEncryption implements Encryption{
    @Override
    public void send() {
        System.out.println("Encrypting message using AES");
    }
}
