package bridge.implementation;

public class MainBridgeImp {
    public static void main(String[] args){
        var remoteControl = new AdvancedRemoteControl(new LGTV() );
        remoteControl.turnOn();
        remoteControl.setChannel(5);
    }
}
