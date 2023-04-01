package Task1B;

public abstract class EmailSender {
    public void SendEmail(String subject, String body, String to, String from,
                          String cc, String sendImmediately){
        EmailService.Send(subject, body, to, from, cc, sendImmediately);
    }
    public void SendEmail(String subject, String body, String to, String from,
                          String cc,)
 {
         EmailService.Send(subject, body, to, from, cc);
         }
}
