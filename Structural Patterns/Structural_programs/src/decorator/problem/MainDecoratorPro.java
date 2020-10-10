package decorator.problem;

public class MainDecoratorPro {
    public static void main(String[] args){
        var cloudStream = new EncryptedCloudStream();
        cloudStream.write("Here is some data");
    }
}
