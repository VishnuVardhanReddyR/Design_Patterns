package strategy.solution;

public class StrategyMain {
    public static void main(String[] args){
            var chat = new ChatClient();
            chat.send(new AesEncryption());
//        var chat = new ChatClient(new AesEncryption());
//        chat.send("hai");
//        var chat1 = new ChatClient(new DesEncryption());
//        chat1.send("hai");
    }
}
