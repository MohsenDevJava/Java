package message;

public class LongMessage extends AbstractionMessage{

    public LongMessage(SenderMessage sender) {
        this.sender = sender;
    }

    @Override
    public void sendMessage(String m) {

        m = "@@@ " + m + " @@@";
        System.out.println("Email : " + m);
    }
}
