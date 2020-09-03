package part3.string_class.task10;

import java.util.Scanner;

public class Task10 {
    public static int countofsentance(String in) {
        int count = 0;
        for(int i = 0;i < in.length(); i ++){
            if(in.charAt(i) == '.' || in.charAt(i) == '?' || in.charAt(i) == '!'){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scaner.nextLine();

        System.out.println(countofsentance(str));
    }
}
