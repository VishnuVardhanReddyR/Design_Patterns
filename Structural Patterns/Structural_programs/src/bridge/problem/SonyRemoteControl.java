package bridge.problem;

public class SonyRemoteControl extends RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Sony: turn on");
    }

    @Override
    public void turnoff() {
        System.out.println("Sony: turn off");
    }
}
