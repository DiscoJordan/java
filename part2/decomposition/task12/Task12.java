package part2.decomposition.task12;

import java.util.Scanner;

public class Task12 {
    public static int getSumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static int getQuantityofNumbers(int k, int n) {
        int num = 0;
        for (int i = 0; i <= n; i++){
            if (getSumOfDigits(i) == k) {
                num++;
            }
        }
        return num;
    }

    public static void fillarray(int a[], int k, int n) {
        int num = 0;
        int j = 0;
        for (int i = 0; i <= n; i++){
            if (getSumOfDigits(i) == k) {
                a[j] = i;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("enter k");
        int k =  var.nextInt();
        System.out.println("enter n");
        int n =  var.nextInt();

        int length = getQuantityofNumbers(k, n);

        int a[] = new int[length];

        fillarray(a, k, n);

        for (int i = 0; i < length; i++){
            System.out.println(a[i] + " ");
        }
    }
}