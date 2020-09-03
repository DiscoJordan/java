package part2.decomposition.task16;

import java.util.Scanner;

public class Task16 {

    public static int evennumbers(int number) {
        int i = 0;
        for(; number != 0; number /= 10) {
            if (number % 10 == 0) {
                continue;
            } else if (number % 2 == 0) {
                i++;
            }
        }
        return i;
    }
    public static boolean isoddnumber(int number) {
        for(; number != 0; number /= 10) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sum(int n) {
        int sum = 0;
        for (int i = (int) Math.pow(10, n - 1) + 1; i < (int) Math.pow(10, n); i++) {

            if (isoddnumber(i)) {

                sum += i;
            }
        }

   return sum;
    }

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("enter n");
        int n = var.nextInt();
       int  sum = sum(n);
        System.out.println("Сумма " + n + "-значных чисел из нечетных цифр равна " + sum);
        int evennumber = evennumbers(sum);
        System.out.println("кол-во четных цифр в числе суммы: " + evennumber);
    }
}

