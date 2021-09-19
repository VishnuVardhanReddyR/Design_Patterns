package bridge.implementation;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnoff(){
        device.turnOn();
    }
}
