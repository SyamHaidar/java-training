package SendEmail;

public class SendEmail {

  public static void main(String[] args) {
    SenderService emailService = new SenderService();

    emailService.SendEmail( // send text only
        "syamhaidar@gmail.com",
        "JavaMail API",
        "This is message body");

    // emailService.SendHTMLEmail( // send html text
    // "syamhaidar@gmail.com",
    // "JavaMail API",
    // "<h4>This is message body with html</h4>");

    // emailService.SendFileEmail( send text with attachment
    // "syamhaidar@gmail.com",
    // "JavaMail API",
    // "This is message body with file attachment");
  }

}