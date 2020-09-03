package part3.string_class.task9;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scaner.nextLine();
    int lowerCase = 0;
    int upperCase = 0;
        for (int k = 0; k < str.length(); k++) {
            if (Character.isUpperCase(str.charAt(k))) upperCase++;
            if (Character.isLowerCase(str.charAt(k))) lowerCase++;
        }
        System.out.printf("Всего %d заглавных букв и %d прописных.",upperCase,lowerCase);
    }
}
