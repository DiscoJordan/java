package part2.decomposition.task4;

import java.util.Scanner;

public class Task4 {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
    public static void main(String[] args) {
        System.out.println("Какое количество точек вы хотите создать?");
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        int[] arrx = new int[n];
        int[] arry = new int[n];
        for (int i = 0;i < n; i++) {
            System.out.println("Введите координаты точки " + i);
            System.out.println("Введите координату 'x' ");
            int x = var.nextInt();
            arrx[i]=x;
            System.out.println("Введите координату 'y' ");
            int y = var.nextInt();
            arry[i]=y;


        }
        System.out.println("Вы ввели следующие точки с координатами: ");
        for (int i = 0;i < n; i++) {
            System.out.print("координаты точки " + i + "\t");
            System.out.println("x: " + arrx[i]  + "\t"+ "y: " + arry[i]);

        }

        double maxDistance = 0;
        double tempDistance;
        int numberOfFirstPoint = 0;
        int numberOfSecondPoint = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                tempDistance = getDistance(arrx[i], arry[i], arrx[j], arry[j]);
                if (tempDistance > maxDistance) {
                    maxDistance = tempDistance;
                    numberOfFirstPoint = i;
                    numberOfSecondPoint = j;
                }
            }
        }
        System.out.print("Самое большое расстояние между точками: " + numberOfFirstPoint + " [" + arrx[numberOfFirstPoint] + "," + arry[numberOfFirstPoint] + "]");
        System.out.println(" и " + numberOfSecondPoint + " [" + arrx[numberOfSecondPoint] + "," + arry[numberOfSecondPoint] + "]");

    }
}
