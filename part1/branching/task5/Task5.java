package part1.branching.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Необходимо вычислить значение функции f(x)");
        System.out.println("Введите 'x':");
        Scanner MyVar = new Scanner(System.in);
        double x = MyVar.nextDouble();
        double r;
        if(x <= 3){
            r = x * x - 3 * x + 9;

        }

        else {
            r = 1 / (x * x * x +6);
        }
        System.out.println("Ответ: " + r);
    }
}
