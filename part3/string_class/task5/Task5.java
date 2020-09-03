package part3.string_class.task5;

import java.util.Scanner;

public class Task5 {
    public static int count(String in){
        int count;
        String out = in.replace("a","");
        count = in.length()-out.length();
        return count;
    }
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scaner.nextLine();
        System.out.println(count(str));
    }
}
