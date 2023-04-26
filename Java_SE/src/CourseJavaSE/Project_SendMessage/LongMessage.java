package CourseJavaSE.Project_SendMessage;

public class LongMessage extends AbstractionMessage {


    public LongMessage(MessageSender sender) {
        this.sender = sender;
    }

    public void sendMessage(String m){
        m = "@"+m+"@";
        sender.sendMessage(m);
    }
}
