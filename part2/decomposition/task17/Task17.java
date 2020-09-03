package part2.decomposition.task17;

import java.util.Scanner;

public class Task17 {
    public static int destroynumber(int number) {
        int i = 0;
        while (number != 0) {
            number -= sumnumbers(number);
            i++;
        }
        return i;
    }

    public static int sumnumbers(int number) {
        int sum = 0;
        for(; number != 0; number /= 10) {
            sum += (number % 10);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner var = new Scanner(System.in);
        int number = var.nextInt();
        System.out.println(destroynumber(number));

    }

}
