package part2.arrays.task1;

import java.util.Scanner;

public class Task1 {
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
        System.out.println("Введите число 'К'");
        int ka= MyVar.nextInt();
        System.out.println("числа кратные К:" );
        for (int i = 0 ; i < n; i++) {

                if ( arr[i] % ka == 0) {

                   sum+=arr[i];
                    System.out.println(arr[i]);

                }

        }
        System.out.println("Cумма  чисел кратных К:" + sum);
    }
}
