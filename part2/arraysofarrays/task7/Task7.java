package part2.arraysofarrays.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        int str = 1;
        do {
            System.out.println("Введите размер квадратной матрицы(четная)");
            Scanner MyVar = new Scanner(System.in);
                str = MyVar.nextInt();
        }
        while (str % 2 != 0);
        double[][] arr = new double[str][str];
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < str; j++) {
                arr[i][j] = (double)(i * i - j * j) / str;

            }
        }

        System.out.println("ваша матрица выглядит так");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < str; j++) {


                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        int count = 0;
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < str; j++) {


                if(arr[i][j] >0  ){
                    count++;
                }
            }

        }
        System.out.println("Кол-во положительных элементов " + count);
    }
}