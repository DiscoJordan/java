package part1.linearprograms.task2;

import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {
            System.out.println("Чтобы решить уравнение введите переменные:");
            System.out.println("Введите значения переменной 'a':");
            Scanner myVar=new Scanner(System.in);
            double a = myVar.nextDouble();
            System.out.println("Введите значения переменной 'b':");
            double b = myVar.nextDouble();
            System.out.println("Введите значения переменной 'c':");
            double c = myVar.nextDouble();
            double z;
            z=((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)  -( a * a * a * c) + 1 / (b * b) );
            System.out.println("Значение переменной 'Z' равно:" + z);




        }
    }


