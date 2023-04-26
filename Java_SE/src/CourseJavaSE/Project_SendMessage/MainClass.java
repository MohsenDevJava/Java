package CourseJavaSE.Project_SendMessage;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Message : ");
        String message = reader.nextLine();
        System.out.print("Enter Type Message sms=1 or email=2 : ");
        int type = reader.nextInt();

        if(type == 2){
            MessageSender send = new EmailMessage();
            LongMessage longMessage = new LongMessage(send);
            longMessage.sendMessage(message);
        } else if (type == 1) {
            MessageSender send = new SmsMessanger();
            ShortMessage shortMessage = new ShortMessage(send);
            shortMessage.sendMessage(message);
        }
    }
}
