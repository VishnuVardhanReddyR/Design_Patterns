package bridge.problem;

public class AdvancedSonyRemoteControl extends AdvancedRemoteControl {

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: set channel");
    }

    @Override
    public void turnOn() {
        System.out.println("Sony: turn on");
    }

    @Override
    public void turnoff() {
        System.out.println("Sony: turn off");
    }
}
