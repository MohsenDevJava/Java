package message;

public abstract class AbstractionMessage {

    public SenderMessage sender;

    public abstract void sendMessage(String m);
}
