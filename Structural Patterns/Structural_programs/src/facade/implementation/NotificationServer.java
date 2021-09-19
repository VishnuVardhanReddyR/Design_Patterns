package facade.implementation;

public class NotificationServer {
    // these are the steps we need to follow, to send a notification.
    //            connect() -> connection
    // connect() first we have to connect to our server.
    // let's say it will return a connection object. that will be later used to disconnect from a server.

    //            authenticate(appID,key) -> AuthToken
    // next we should authenticate, so here we have to provide some kind of application identifier(String that is unique to each app).
    // we should also provide a key, this is like a passport visa application.
    // let's say this authenticate method gonna return, Authentication token object.
    // So, we need to pass this token, when sending a message.

    //             send(authToken, message, target)
    // so, we need an other method here which takes an authentication token, along with the message and perhaps
    // the string that specifies the target user or the target user device.
    //
    //And finally we are done, we have to disconnect.
    //So, we call con.disconnect().
    public Connection connect(String ipAddress){
        return new Connection();
    }

    public AuthToken authenticate(String appID, String Key){
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target){
        System.out.println("sending a message ..");
    }
}
