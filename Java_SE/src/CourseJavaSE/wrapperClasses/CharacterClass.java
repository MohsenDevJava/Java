package CourseJavaSE.wrapperClasses;

public class CharacterClass {
    public static void main(String[] args) {


        Character ch1 = 'A';
        char ch2 = 'y';

        String ch3 = ch1.toString();

        System.out.println(ch1.charValue());
        System.out.println(ch1.equals(ch2));
        System.out.println(ch1.toString(ch2));
        System.out.println(ch1 + 100);
        System.out.println(ch1.compareTo(ch2));
        System.out.println(ch1.hashCode());
        System.out.println(ch3);
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isDigit(ch2));
        System.out.println(Character.toUpperCase(ch1));
        System.out.println(Character.toLowerCase(ch2));







//        Character  ch1 = 'A';
//        char ch2= '2';
//
//        System.out.println(ch1.charValue());
//        System.out.println(ch1.equals(ch2));
//        System.out.println(ch1.compareTo(ch2));
//        String str = ch1.toString();
//        System.out.println(str);
//
//        System.out.println(Character.isWhitespace(ch1));
//        System.out.println(Character.toLowerCase(ch1));
//        System.out.println(Character.toUpperCase(ch1));
//        System.out.println(Character.isDigit(ch2));
//        System.out.println(Character.isLetter(ch1));
//        System.out.println(ch1.charValue());
    }
}
