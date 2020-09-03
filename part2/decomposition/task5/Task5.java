package part2.decomposition.task5;

import java.util.Scanner;

public class Task5 {

        public static int secondlargest(int array[], int n){
            int largest = array[0];
            int secondlargest = -2147483648;
            for (int i = 0; i < n; i++){
                if (array[i] > largest){
                    largest = array[i];
                }
            }
            for (int i = 0; i < n; i++){
                if ((array[i] > secondlargest) && (array[i] != largest)){
                    secondlargest = array[i];
                }
            }
            return secondlargest;
        }

        public static void main(String[] args) {
        System.out.println("Какое количество чисел, которое вы хотите добавить в массив:");
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n; i++){
            System.out.println("Введите число " + i);
            int x = var.nextInt();
            arr[i] = x;

        }

            System.out.println(secondlargest(arr,n));

    }
}
