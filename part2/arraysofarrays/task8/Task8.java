package part2.arraysofarrays.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("Какое количество cтрок вы хотите добавить в матрицу?");
        Scanner MyVar = new Scanner(System.in);
        int str = MyVar.nextInt();
        System.out.println("Какое количество cтолбцов вы хотите добавить в матрицу?");
        int sto = MyVar.nextInt();
        int[] [] tarr = new int[str][sto];
        int[] [] arr = new int[str][sto];
        int[] [] trarr = new int[str][sto];

        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j++) {
                System.out.println("введите элемент матрицы под номером :" + "[" + i + "]" + "[" + j + "]");
                int a = MyVar.nextInt();
                tarr[i][j] = a;
                arr[i][j] = a;
                trarr[i][j]=a;

            }
        }
        System.out.println("ваша матрица выглядит так");
        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j++) {


                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Какой столбец вы хотите поменять?");
        int h = MyVar.nextInt();
        System.out.println(" С каким столбцом вы хотите поменять столбец " + h);
        int d = MyVar.nextInt();
        for(int i = 0; i < str;i ++) {

               arr[i][d-1]=tarr[i][h - 1];
               arr[i][h-1]=trarr[i][d - 1];



        }

        System.out.println("ваша новая матрица выглядит так");
        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j ++) {

                    System.out.print(arr[i][j] + "\t" );
                }
            System.out.println(" ");

            }

        }


}
