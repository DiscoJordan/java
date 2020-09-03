package part2.arraysofarrays.task14;

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {


        System.out.println("Какое количество cтрок вы хотите добавить в матрицу?");
        Scanner MyVar = new Scanner(System.in);
        int str = MyVar.nextInt();
        System.out.println("Какое количество cтолбцов вы хотите добавить в матрицу?");
        int sto = MyVar.nextInt();
        int[][] arr = new int[str][sto];
        Random rnd = new Random();




        int k = 0;
        int count = 0;
        for (int i = 0; i < sto; i++) {
            for (int j = 0; j < str; j++) {

                while(k == i) {

                    for (int g =0; g <= k; g++) {
                        j = rnd.nextInt(str);
                        if (arr[j][i] == 0){

                                 arr[j][i] = 1;
                                 g++;
                             }
                        if (arr[j][i] == 1){
                            g--;
                            continue;
                        }
                    }
                    k++;
                }

            }

            }
        System.out.println("ваша матрица выглядит так");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {


                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");

        }
        }
}
