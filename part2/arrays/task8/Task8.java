package part2.arrays.task8;

import java.util.Scanner;

public class Task8 {
    public static void main (String[]args){
        System.out.println("Какое количество элементов вы хотите добавить в массив?");
        Scanner MyVar = new Scanner(System.in);
        int n = MyVar.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < n; k++) {
            System.out.println("введите элемент массива под номером :" + k);
            int a = MyVar.nextInt();
            arr[k] = a;

        }
        System.out.println("ваш массив выглядит так");
        for (int l = 0; l < n; l++) {
            System.out.println(arr[l]);
        }
        int min = arr[0];
        int s = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] < min) {
                    arr[i] = min;

                }
            }
            for (int i = 0; i < n; i++) {
                if(min == arr[i]){
                    s++;
                }
            }
        int[] array = new int[n - s];
            int h = 0;

        for(int l = 0; l < n; l++){
            if(arr[l] == min){
                continue;

            }
            array[h] = arr[l];
            h++;
        }
        System.out.println("ваш  новый массив выглядит так");
        for (int l = 0; l < n-s; l++) {
            System.out.println(array[l]);
        }

    }
}
