package part2.arraysofarrays.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        System.out.println("Введите размер квадратной матрицы");
        Scanner MyVar = new Scanner(System.in);
        int str = MyVar.nextInt();
        int sto = str;
        int[][] tarr = new int[str][sto];
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {
                System.out.println("введите элемент матрицы под номером :" + "[" + i + "]" + "[" + j + "]");
                int a = MyVar.nextInt();
                tarr[i][j] = a;

            }
        }
        System.out.println("ваша матрица выглядит так");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {


                System.out.print(tarr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("На диагонали лежат следующие элементы");
        for (int i = 0; i < str; i++) {

            System.out.print(tarr[i][i]);


        }

    }
}
