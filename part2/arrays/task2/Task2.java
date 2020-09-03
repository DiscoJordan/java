package part2.arrays.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Какое количество элементов вы хотите добавить в массив?");
        Scanner MyVar = new Scanner(System.in);
        int n = MyVar.nextInt();
        double[] arr = new double[n];
        for(int k = 0; k < n;k ++)
        {
            System.out.println("введите элемент массива под номером :" + k);
            double a = MyVar.nextDouble();
            arr[k] = a;

        }
        System.out.println("ваш массив выглядит так");
        for(int l = 0; l < n;l ++)
        {
            System.out.println(arr[l]);


        }
        int sum =0;
        System.out.println("Введите число 'Z'");
        int z= MyVar.nextInt();

        int s = 0;
        for (int i = 0 ; i < n; i++) {

            if ( arr[i] > z) {


                arr[i] = z;
                s++;


            }

        }
        System.out.println("ваш массив выглядит так");
        for(int l = 0; l < n;l ++)
        {
            System.out.println(arr[l]);


        }
        System.out.println("Количество замен: " + s );

    }
}
