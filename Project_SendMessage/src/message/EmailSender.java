package message;

public class EmailSender implements SenderMessage{
    @Override
    public void sendMessage(String m) {
        System.out.println("EmailSender : " + m);
    }
}
