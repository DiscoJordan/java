package part3.string_class.task7;

import java.util.Scanner;

public class Task7 {
    public static String deleteduplicate(String in) {
        String out = in.replace(" ","");
        StringBuilder sb = new StringBuilder();
        out.chars().distinct().forEach(c -> sb.append((char) c));

return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scaner.nextLine();

        System.out.println(deleteduplicate(str));
    }
}