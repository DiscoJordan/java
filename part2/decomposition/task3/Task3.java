package part2.decomposition.task3;

import java.util.Scanner;

public class Task3 {
    public static double s(double a)
    {
        return 3 * a * a * Math.sqrt(3) * 0.5;
    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Введите сторону шестиугольника ");
        double a = var.nextInt();
        System.out.println("Площадь  шестиугольника: ");
        System.out.println(s(a));
    }
}
