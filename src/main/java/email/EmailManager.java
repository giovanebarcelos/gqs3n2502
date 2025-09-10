package email;

public class EmailManager {

    private final EmailService emailService;

    public EmailManager(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendWelcomeEmail(String to){
        emailService.sendEmail(to, "Welcome!", "Welcome to our platform.");
    }
}
