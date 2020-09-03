package part2.arraysofarrays.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int str = 1;
        do {
            System.out.println("Введите размер квадратной матрицы(четная)");
            Scanner MyVar = new Scanner(System.in);
            str = MyVar.nextInt();
        }
        while (str % 2 != 0);
        int[][] arr = new int[str][str];
        for (int i = 0; i < str / 2; i++) {
            for (int j = i; j < str - i; j++) {
                arr[i][j] = 1;
                arr[str - i - 1][j] = 1;
            }
        }

        System.out.println("ваша матрица выглядит так");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < str; j++) {


                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}