package CourseJavaSE;

import java.util.regex.*;
public class Regex {

    public static void main(String[] args) {
        Pattern pattern1=Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
        Pattern pattern2=Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Pattern pattern3=Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$");
        Matcher matcher1=pattern1.matcher("5MOHsen%");
        Matcher matcher2=pattern2.matcher("fS4@Dv4&");
        Matcher matcher3=pattern3.matcher("5MOHsen$s");
//        while (matcher1.find()){
//            System.out.println(matcher1.matches()+"\t"+matcher1.group()+"\t"+matcher1.start()+"\t"+matcher1.end());
//        }
//        while (matcher2.find()){
//            System.out.println(matcher2.matches()+"\t"+matcher2.group()+"\t"+matcher2.start()+"\t"+matcher2.end());
//        }

        while (matcher3.find()){
            System.out.println(matcher3.matches()+"\t"+matcher3.group()+"\t"+matcher3.start()+"\t"+matcher3.end());
        }
    }
}
