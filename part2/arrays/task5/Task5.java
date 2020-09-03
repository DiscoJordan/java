package part2.arrays.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Какое количество элементов вы хотите добавить в массив?");
        Scanner MyVar = new Scanner(System.in);
        int n = MyVar.nextInt();
        int[] arr = new int[n];
        for(int k = 0; k < n;k ++)
        {
            System.out.println("введите элемент массива под номером :" + k);
            int a = MyVar.nextInt();
            arr[k] = a;

        }
        System.out.println("ваш массив выглядит так");
        for(int l = 0; l < n;l ++)
        {
            System.out.println(arr[l]);


        }
        int sum =0;
        System.out.println("Введите число 'I'");
        int z= MyVar.nextInt();

        int s = 0;
        for (int i = 0 ; i < n; i++) {

            if ( arr[i] > z) {


                System.out.println(arr[i]);


            }

        }


    }
}
