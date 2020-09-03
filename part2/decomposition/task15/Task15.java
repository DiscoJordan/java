package part2.decomposition.task15;

import java.util.Scanner;

public class Task15 {
    public static boolean isVozrastanieNumber(int i){

            for(; i != 0; i/= 10) {
                if ((i % 100) / 10 >= i % 10) {
                    return false;
                }
            }
            return true;
        }


    public static void vozrastanie(int n) {

            for (int i = (int)Math.pow(10,n - 1); i < (int)Math.pow(10,n); i++) {
                if (isVozrastanieNumber(i)) {
                    System.out.println(i + " ");
                }
            }

    }
    public static void main(String[] args) {
        System.out.println("Введите n:");
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        vozrastanie(n);

    }
}
