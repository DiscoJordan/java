package part1.branching.task3;

import java.util.Scanner;

public class Task3 {
   public static void main(String[] args) {
       System.out.println("Введите координаты трех точек");

       System.out.println("Введите координаты 'х1'");
       Scanner myVar=new Scanner(System.in);
       int x1 = myVar.nextInt();
       System.out.println("Введите координаты 'y1'");
       int y1 = myVar.nextInt();
       System.out.println("Введите координаты 'x2'");
       int x2 = myVar.nextInt();
       System.out.println("Введите координаты 'y2'");
       int y2 = myVar.nextInt();
       System.out.println("Введите координаты 'x3'");
       int x3 = myVar.nextInt();
       System.out.println("Введите координаты 'y3'");
       int y3 = myVar.nextInt();
       if (x1 == x2 && x1 == x3 || y1 == y2 && y1 ==y3)
       {
           System.out.println("Эти точки лежат на одной прямой");
       }
       else if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
           System.out.println("Эти точки лежат на одной прямой");
       }
       else{
           System.out.println("Эти точки НЕ лежат на одной прямой");
       }

    }
}
