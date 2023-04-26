package CourseJavaSE.Project_SendMessage;

public class ShortMessage extends AbstractionMessage{

    public ShortMessage(MessageSender sender) {
        this.sender = sender;
    }

    public void sendMessage(String m){
        if(m.length() < 20){
            sender.sendMessage(m);
        }else{
            System.out.println("The length of your message is longer than SMS.");
        }
    }
}
