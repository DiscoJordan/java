package part1.cycles.task8;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int m = scaner.nextInt();
        int n = scaner.nextInt();
        boolean b1[] = new boolean[10];
        boolean b2[] = new boolean[10];
        while (m > 0){
            b1[m % 10] = true;
            m /= 10;
        }
        while (n > 0){
            b2[n % 10] = true;
            n /= 10;
        }
        for (int i = 0; i < 10; i++){
            if (b1[i] && b2[i]){
                System.out.println(i);
            }
        }
    }
}