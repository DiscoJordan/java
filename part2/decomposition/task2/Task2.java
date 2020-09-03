package part2.decomposition.task2;

import java.util.Scanner;

public class Task2 {
    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        if (n > m) {
            return gcd(m, n - m);
        } else {
            return gcd(n, m - n);
        }
    }

    public static int multygcd(int a, int b, int c, int d)
    {
        return gcd(gcd(a, b), gcd(c,d));
    }

    public static void main(String[] args)
    {  Scanner var = new Scanner(System.in);
        System.out.println("Введите первоe число ");
        int a = var.nextInt();
        System.out.println("Введите второе число: ");
        int b = var.nextInt();
        System.out.println("Введите третее число ");
        int c = var.nextInt();
        System.out.println("Введите четвертое число: ");
        int d = var.nextInt();
        System.out.println(multygcd(a,b,c,d));
    }

}