package part1.cycles.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите отрезок и шаг");
        System.out.println("введите начало отрезка");
        Scanner myVar = new Scanner(System.in);
        int a = myVar.nextInt();
        System.out.println("введите конец отрезка");
        int b = myVar.nextInt();
        System.out.println("введите шаг");
        int s = myVar.nextInt();
        int y;
        while (a<=b){
            if(a<=2){
                y=-a;
            }
            else{
                y=a;
            }
            System.out.println("Y равен:" + y);
            a=a+s;

        }
    }
}
