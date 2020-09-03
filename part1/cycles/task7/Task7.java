package part1.cycles.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);
        System.out.println("Введите начало промежутка 'm' " );
        int m = myVar.nextInt();
        System.out.println("Введите конец промежутка 'n' ");
        int n = myVar.nextInt();
        for (int i = m + 1; i < n; i++) {
            System.out.println("делители " + i);
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    System.out.println(j);
                }
            }
        }
    }
}
