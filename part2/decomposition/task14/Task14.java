package part2.decomposition.task14;


import java.util.Scanner;

public class Task14 {
    public static boolean arms(int k){
        int count = 1;
        int sum = 0;
       int w = k;
        while (w >= 10) {
            w = w / 10;
            count++;
        }
        w = k;
        for (int r = 0; r < count; r++) {
        sum += Math.pow((w % 10),count);
        w /= 10;
        }

            if(sum == k){

                return true;

            }
            else{
                return false;
            }


        }


    public static void allArmstrongNumbers(int k) {
        for (int i = 1; i < k; i++) {
            if (arms(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите k:");
        Scanner var = new Scanner(System.in);
        int k = var.nextInt();
        allArmstrongNumbers(k);

    }
}
