package SendEmail;

public class SendEmail {

  public static void main(String[] args) {
    SenderService senderService = new SenderService();

    senderService.SendEmail(
        "receipt@gmail.com",
        "JavaMail API",
        "This is test message");
  }

}