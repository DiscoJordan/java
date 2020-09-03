package part2.arrays.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
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
        int sum = 0;


        boolean b = true;
        for (int i = 1; i < n; i++) {
            for (int j = 2; j <= (i + 1 ) / 2; j++) {
                if((i + 1) % j == 0){
                    b = false;
                }


            }
            if (b){
                sum += arr[i];

            }
            b = true;
        }
        System.out.println("Сумма номеров простых чисел равна: " + sum);
    }
}
