package part2.decomposition.task1;

import java.util.Scanner;

public class Task1 {
    public static int nod(int n, int m) {
        if (m == 0) {
            return n;
        }
        if (n > m) {
            return nod(m, n - m);
        } else {
            return nod(n, m - n);
        }
    }

    public static int nok(int n, int m) {
        return (n * m) / nod(n, m);
    }

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Введите первоe число ");
        int m = var.nextInt();
        System.out.println("Введите второе число: ");
        int n = var.nextInt();
        System.out.println("nod: " + nod(n,m));
        System.out.println("nok: " + nok(n,m));
    }
}
