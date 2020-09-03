package part1.branching.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Дано : max(min(a,b),min(c,d)");

        System.out.println("Введите 'a'");
        Scanner myVar=new Scanner(System.in);
        int a = myVar.nextInt();
        System.out.println("Введите 'b'");
        int b = myVar.nextInt();
        System.out.println("Введите 'c'");
        int c = myVar.nextInt();
        System.out.println("Введите 'd'");
        int d = myVar.nextInt();
        int r;
        r = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println("Ответ:" + r );




    }
}
