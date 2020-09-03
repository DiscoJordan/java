package part2.arraysofarrays.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

            System.out.println("Какое количество cтрок вы хотите добавить в матрицу?");
            Scanner MyVar = new Scanner(System.in);
            int str = MyVar.nextInt();
        System.out.println("Какое количество cтолбцов вы хотите добавить в матрицу?");
        int sto = MyVar.nextInt();
        int[] [] tarr = new int[str][sto];
        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j++) {
                System.out.println("введите элемент матрицы под номером :" + "[" + i + "]" + "[" + j + "]");
                int a = MyVar.nextInt();
                tarr[i][j] = a;

            }
        }
            System.out.println("ваша матрица выглядит так");
        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j++) {


                System.out.print(tarr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("ваша новая матрица выглядит так");
        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j = j + 2) {
                if(tarr[0][j] > tarr[str - 1][j]){
                    System.out.print(tarr[i][j] + "\t" );
                }

            }
            System.out.println(" ");
        }

        }



}
