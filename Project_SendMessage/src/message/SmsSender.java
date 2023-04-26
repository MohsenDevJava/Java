package message;

public class SmsSender implements SenderMessage{
    @Override
    public void sendMessage(String m) {
        System.out.println("SmsSender : " + m);
    }
}
