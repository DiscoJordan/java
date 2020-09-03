package part2.decomposition.task8;

import java.util.Scanner;

public class Task8 {
    public static int sum3(int array[], int k, int m) {
        return (array[k] + array[k + 1] + array[k + 2]);
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter n");
        int n = scaner.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = scaner.nextInt();
        }
    }

}
