package part3.string_class.task3;
import java.util.Scanner;

public class Task3 {
    public static boolean palindrom(StringBuffer s) {
        String s1 = s.toString();
        s.reverse();
        String s2 = s.toString();
        return (s1.equals(s2)) ? true : false;

    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scaner.next();
        StringBuffer sb = new StringBuffer(str);
        System.out.println(palindrom(sb));
    }
}