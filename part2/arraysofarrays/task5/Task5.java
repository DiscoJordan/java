package part2.arraysofarrays.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int str = 1;
        do {
            System.out.println("Введите размер квадратной матрицы(четная)");
            Scanner MyVar = new Scanner(System.in);
            str = MyVar.nextInt();
        }
        while (str % 2 != 0);
        int sto = str;
        int[][] tarr = new int[str][sto];
        int s = 0;
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {

                tarr[i][j] = 1 + s;

            }
            s++;

        }
        int u = 1;
        for (int i = 1; i < str; i++) {
            for (int j = 0; j < sto; j++) {

                if (tarr[j] == tarr[str - u] )
                {
                    for(j = j; j < sto; j++) {
                        tarr[i][j] = 0;
                    }

                }


            }
            u++;
        }



            System.out.println("ваша матрица выглядит так");
            for (int i = 0; i < str; i++) {
                for (int j = 0; j < sto; j++) {


                    System.out.print(tarr[i][j] + "\t");
                }
                System.out.println(" ");
            }
        }

}
