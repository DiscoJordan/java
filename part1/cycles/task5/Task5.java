package part1.cycles.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите число 'e':");
        Scanner myVar = new Scanner(System.in);
        double e = myVar.nextDouble();
        double a3 = 1 / 3.;
        double a2 = 1 / 2.;
        double sum = 0;

        while(a2 + a3 >=e) {

            sum += (a2 + a3);
            a2 /= 2;
            a3 /=3;
            }
        System.out.println("Сумма:" +sum);
        }



}
