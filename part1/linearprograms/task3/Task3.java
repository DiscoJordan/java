package part1.linearprograms.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Чтобы решить уравнение введите переменные:");
        System.out.println("Введите значения переменной 'x':");
        Scanner myVar=new Scanner(System.in);
        double x = myVar.nextDouble();
        System.out.println("Введите значения переменной 'y':");
        double y = myVar.nextDouble();
        double z;
        z=(((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) ) + Math.tan(x * y));
        System.out.println("Значение переменной 'Z' равно:" + z);




    }

}
