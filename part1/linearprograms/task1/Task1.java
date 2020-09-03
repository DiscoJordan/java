package part1.linearprograms.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Чтобы решить уравнение Z=((a-3)*b/2)+c введите переменные:");
        System.out.println("Введите значения переменной 'a':");
        Scanner myVar=new Scanner(System.in);
        double a = myVar.nextInt();
        System.out.println("Введите значения переменной 'b':");
        double b = myVar.nextInt();
        System.out.println("Введите значения переменной 'c':");
        double c = myVar.nextInt();
        double z;
        z=((a - 3) * b / 2) + c;
        System.out.println("Значение переменной 'Z' равно:" + z);




    }
}
