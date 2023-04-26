package message;

public class ShortMessage extends AbstractionMessage{

    public ShortMessage(SenderMessage sender) {
        this.sender = sender;
    }

    @Override
    public void sendMessage(String m) {
     if(m.length() < 20){
         System.out.println("SMS : " + m);
     }else {
         System.out.println("The length of your message is longer than SMS.");
     }
    }
}
