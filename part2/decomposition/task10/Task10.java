package part2.decomposition.task10;

import java.util.Scanner;

public class Task10 {
    public static int[] array(int x){
        int count = 0 ;
        int y = x;
        double w = x;
        while (y >= 1){
               y = y / 10;
                count ++;
        }
        int[] arr = new int[count];
        for(int k = 0; k < count; k++)
        {
            if (k == 0){
                arr[k] = (int)w/(int)Math.pow(10,count - k -1);
            }
            else{
                arr[k] = (int)((w%Math.pow(10,count - k ))/Math.pow(10,count - k - 1));
            }
        }
        for(int k = 0; k < count; k++)
        {
            System.out.println("[" + arr[k] + "]");
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Введите натуральное число которое хотите разложить на цифры в массив");
        Scanner var = new Scanner(System.in);
        int x = var.nextInt();
       array(x);




    }
}
