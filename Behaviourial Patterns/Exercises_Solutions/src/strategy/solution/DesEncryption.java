package strategy.solution;

public class DesEncryption implements Encryption{
    @Override
    public void send() {
        System.out.println("Encrypting message using DES");
    }
}
