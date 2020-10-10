package facade.implementation;

public class MainFacadeImp {
    public static void main(String[] args){
        var service = new NotificationService();
        service.send("Hello plus","target");
    }
}
