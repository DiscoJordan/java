package part2.arraysofarrays.task13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {


        System.out.println("Какое количество cтрок вы хотите добавить в матрицу?");Scanner MyVar = new Scanner(System.in);
        int str = MyVar.nextInt();
        System.out.println("Какое количество cтолбцов вы хотите добавить в матрицу?");
        int sto = MyVar.nextInt();
        int[][] arr = new int[str][sto];
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {
                System.out.println("введите элемент матрицы под номером :" + "[" + i + "]" + "[" + j + "]");
                int a = MyVar.nextInt();
                arr[i][j] = a;

            }
        }
        System.out.println("ваша матрица выглядит так");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {


                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");

        }
        int temp;

        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {
                for (int k = j; k < sto; k++) {
                    if ((arr[i][j] < arr[i][k]) ) {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
        }


        System.out.println("ваша матрица  с рядами по убыванию выглядит так");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {


                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {
                for (int k = j; k < sto; k++) {
                    if ((arr[i][j] > arr[i][k]) ) {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
        }
        System.out.println("ваша матрица с рядами  по возрастанию выглядит так");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {


                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }
    }
