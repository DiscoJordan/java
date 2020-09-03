package part2.arraysofarrays.task15;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        System.out.println("Какое количество cтрок вы хотите добавить в матрицу?");
        Scanner MyVar = new Scanner(System.in);
        int str = MyVar.nextInt();
        System.out.println("Какое количество cтолбцов вы хотите добавить в матрицу?");
        int sto = MyVar.nextInt();
        int[][] tarr = new int[str][sto];
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {
                System.out.println("введите элемент матрицы под номером :" + "[" + i + "]" + "[" + j + "]");
                int a = MyVar.nextInt();
                tarr[i][j] = a;

            }
        }
        int max = -9999999;
        System.out.println("ваша матрица выглядит так");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {
                if(tarr[i][j] > max) {
                    max = tarr[i][j];
                }


                System.out.print(tarr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Максимальный элемент матрицы " + max);
        System.out.println("ваша  новая матрица выглядит так");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {
                if(tarr[i][j] % 2 != 0) {
                    tarr[i][j] = max;
                }


                System.out.print(tarr[i][j] + "\t");
            }
            System.out.println(" ");
        }

        }
    }

