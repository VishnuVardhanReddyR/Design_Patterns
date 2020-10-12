package adapter.solution;

import adapter.solution.Gmail.GmailClient;

public class MainAdapterSol {
    public static void main(String[] args){
        var client = new EmailClient();
        client.addProvider(new GmailProvider(new GmailClient()));
        client.downloadEmails();
    }
}
