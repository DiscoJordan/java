package part3.string_class.task2;

import java.util.Scanner;

public class Task2 {
    public static String addbaftera(String in) {
        String out = in.replace("a","ab");
        return out;
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scaner.nextLine();
        str = addbaftera(str);
        System.out.println(str);
    }
}


