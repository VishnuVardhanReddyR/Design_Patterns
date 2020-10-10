package facade.problem;

public class MainFacadePro {
    public static void main(String[] args){
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appId","key");
        var message = new Message("hello plus");
        server.send(authToken,message,"target");
        connection.disConnect();
    }
}
