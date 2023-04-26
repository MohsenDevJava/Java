package CourseJavaSE.Project_SendMessage;

public class SmsMessanger implements MessageSender{
    @Override
    public void sendMessage(String Message) {
        System.out.println("Sms send : " + Message);
    }
}
