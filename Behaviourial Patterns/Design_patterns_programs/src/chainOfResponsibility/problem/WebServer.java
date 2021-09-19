package chainOfResponsibility.problem;

public class WebServer {
    public void handle(HttpRequest request){
        // Authentication - you want to know that this is sent by a valid user.
        var Authenticator = new Authenticator();
        // Because of the new keyword this class is tightly coupled with authenticator.
        // To solve this problem we can create a Authenticator Interface and have our webserver talk to
        // an authenticator Interface. The same is applied to logger and compressor.

        // Logging
        // Compression and so on.

        // Even they are decoupled with this class the order of these methods are hard coded in this class.
        // If in the future we want to disable logging for certain scenario's we cannot do so.
        // we have to come back and change the code in this class.
        // Similarly if we want to add something like Encryption, we have to come here and change the code.
        // this is the problem that chain of responsibility solves.
        // With this pattern, we can build a pipeline or chain of objects are processing a request.
        // And that request does not be a httpRequest, it can be any request.
    }
}
