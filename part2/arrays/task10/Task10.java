package part2.arrays.task10;

import java.util.Scanner;

public class Task10 {
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
        System.out.println("Ваш новый массив:" );
       for(int l = 1; l < n; l = l + 2){
           arr[l] = 0;

       }
        for(int l = 0; l < n;l ++)
        {
            System.out.println(arr[l]);

        }


    }
}
