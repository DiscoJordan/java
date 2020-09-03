package part3.string_class.task6;

import java.util.Scanner;

public class Task6 {
    public static String doubler(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scaner.nextLine();
        System.out.println(doubler(str));
    }
}
