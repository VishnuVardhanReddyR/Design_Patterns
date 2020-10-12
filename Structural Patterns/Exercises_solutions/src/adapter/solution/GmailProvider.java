package adapter.solution;

import adapter.solution.Gmail.GmailClient;

public class GmailProvider implements EmailProvider{
    private GmailClient gmailClient;

    public GmailProvider(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
