package part2.arrays.task7;

import java.util.Scanner;

public class Task7 {

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
           int max = arr[0] + arr[n - 1];

            for (int i = 0; i < n/2; i++) {
                if (arr[i] + arr [n - i -1] > max) {
                    max = arr[i] + arr [n - i -1];
                }

                ;

            }
            System.out.println( "Ответ :" + max );

    }
}
