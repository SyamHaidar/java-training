package SendEmail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SenderService {

  public void SendEmail(String to, String subject, String body) {

    // Get system properties
    Properties properties = System.getProperties();

    // Setup mail server
    properties.setProperty("mail.smtp.host", "smtp.gmail.com");
    properties.setProperty("mail.smtp.port", "587");
    properties.setProperty("mail.smtp.auth", "true");
    properties.setProperty("mail.smtp.starttls.enable", "true");

    // Setup account
    // link: https://www.youtube.com/watch?v=ugIUObNHZdo&t=217s
    String username = "sender@gmail.com";
    String password = "******";

    // Setup sender
    String from = "sender@gmail.com"; // sama seperti username

    // Get the default Session object.
    Session session = Session.getDefaultInstance(properties, new Authenticator() {
      @Override
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
      }
    });

    try {
      // Create a default MimeMessage object.
      MimeMessage message = new MimeMessage(session);

      // Set From: header field of the header.
      message.setFrom(new InternetAddress(from));

      // Set To: header field of the header.
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

      // Set Subject: header field
      message.setSubject(subject);

      // Now set the actual message
      message.setText(body); // text

      // Send the actual HTML message, as big as you like
      // message.setContent("<h1>This is actual message</h1>", "text/html");

      // Send message
      Transport.send(message);

      System.out.println("Sent message successfully....");
    } catch (MessagingException mex) {
      mex.printStackTrace();
    }
  }

}
