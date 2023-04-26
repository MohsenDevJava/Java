package message;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Message: ");
        String message = reader.nextLine();
        System.out.print("Enter type send Message email=1 | sms=2 : ");
        int type = reader.nextInt();

        if(type == 1){
            SenderMessage email = new EmailSender();
            LongMessage longMessage = new LongMessage(email);
            longMessage.sendMessage(message);
        } else if (type == 2) {
            SenderMessage sms = new SmsSender();
            ShortMessage shortMessage = new ShortMessage(sms);
            shortMessage.sendMessage(message);
        }

    }
}