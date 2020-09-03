package part2.arrays.task4;

import java.util.Scanner;

public class Task4 {

        public static void main (String[]args){
            System.out.println("Какое количество элементов вы хотите добавить в массив?");
            Scanner MyVar = new Scanner(System.in);
            int n = MyVar.nextInt();
            double[] arr = new double[n];
            for (int k = 0; k < n; k++) {
                System.out.println("введите элемент массива под номером :" + k);
                double a = MyVar.nextDouble();
                arr[k] = a;

            }
            System.out.println("ваш массив выглядит так");
            for (int l = 0; l < n; l++) {
                System.out.println(arr[l]);

            }
            double max = arr[0];
            double min = arr[0];
            for(int l = 0;l < n;l ++){
                if(arr[l] > max){
                    max = arr[l];
                }

            }
            for(int l = 0;l < n;l ++) {
                if (arr[l] < min) {
                    min = arr[l] ;
                }
            }
            System.out.println("Минимальное :" + min + " Мaксимальное :" + max);



            }


}
