package part1.branching.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите размеры отверстия:");
        System.out.println("Введите Ширину отверстия 'A':");
        Scanner myVar = new Scanner(System.in);
        int a = myVar.nextInt();
        System.out.println("Введите Высоту отверстия 'B':");
        int b = myVar.nextInt();
        System.out.println("Введите размеры кирпича:");
        System.out.println("Введите координату 'x' кирпича : ");
        int x = myVar.nextInt();
        System.out.println("Введите координату 'y' кирпича : ");
        int y = myVar.nextInt();
        System.out.println("Введите координату 'z' кирпича : ");
        int z = myVar.nextInt();
        if (x <= a && y <= b || x <= b && y <= a || x <= a && z <= b || x <= b && z <= a || z <= a && y <= b || z <= b && y <= a )
        { System.out.println("Кирпич проходит в отверстие");}
        else
            { System.out.println("Кирпич НЕ проходит в отверстие");}



    }
}
