package part3.string_class.task1;

import java

public class Task1 {
    public static int numberofspaces(String s) {
        int max = 0, len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                len++;
                if (len > max) {
                    max = len;
                }
            } else {
                len = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scaner.nextLine();
        System.out.println(numberofspaces(str));
    }
}