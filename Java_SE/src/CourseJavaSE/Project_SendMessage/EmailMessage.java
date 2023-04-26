package CourseJavaSE.Project_SendMessage;

public class EmailMessage implements MessageSender{
    @Override
    public void sendMessage(String Message) {
        System.out.println("Email send : " + Message);
    }
}
