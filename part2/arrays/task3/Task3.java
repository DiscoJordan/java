package part2.arrays.task3;

import java.util.Scanner;

public class Task3 {
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
        int b = 0;
        int m = 0;
        int o = 0;
        for (int i = 0 ; i < n; i++) {

            if ( arr[i] > 0) {
                b++;
            }
            if ( arr[i] < 0) {
                m++;
            }
            if ( arr[i] == 0) {
                o++;
            }

        }
        System.out.println("кол-во эл-тов массива меньше нуля :" + m);
        System.out.println("кол-во эл-тов массива больше нуля :" + b);
        System.out.println("кол-во эл-тов массива равное нулю :" + o);



    }
}
