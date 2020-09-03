package part2.arraysofarrays.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

      int str =1;
       do{System.out.println("Введите размер квадратной матрицы(четная)");
        Scanner MyVar = new Scanner(System.in);
         str = MyVar.nextInt();}
       while(str % 2 !=0);
        int sto = str;
        int[][] tarr = new int[str][sto];
        int s =0;
        for (int i = 0; i < str; i = i + 2) {
            for(int j =0; j < sto; j ++){

                tarr[i][j] = 1 + s;
                s++;
            }
            s = 0;

        }
        int t = 0;
        for (int i = 1; i < str; i = i + 2) {
            for(int j =0; j < sto; j ++){

                tarr[i][j] = str  - t;
                t++;
            }
            t = 0;

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
