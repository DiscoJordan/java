package part2.sort.task5;


import java.util.Scanner;

public class Task5 {
    public static int binarysearch(int array[], int key, int left, int right){
        int result = 0;
        int mid = 0;
        if (key >= array[right]) {
            return right + 1;
        } else if (key <= array[left]) {
            return left;
        }
        while (left <= right) {
            mid = (left + right) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (key < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter n");
        int n = scaner.nextInt();
        int temp = 0;
        int num = 0;

        System.out.println("enter array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = scaner.nextInt();
        }

        for (int i = 1; i < n; i++){
            num = binarysearch(a, a[i], 0, i - 1);
            temp = a[i];
            for (int j = i; j > num; j--){
                a[j] = a[j-1];
            }
            a[num] = temp;
        }

        for (int i = 0; i < n; i++){
            System.out.println(a[i] + " ");
        }
    }}




























































































































































