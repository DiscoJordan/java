package part2.decomposition.task9;
import java.util.Scanner;
public class Task9 {
    public static double area(double x, double y, double z, double t){
        double diagonal = Math.sqrt(x * x + y * y);
        double area1 = x * y / 2;
        double perimeter = (z + t + diagonal) / 2;
        double area2 = Math.sqrt(perimeter * (perimeter - z) * (perimeter - t)
                * (perimeter - diagonal));
        return (area1 + area2);
    }

    public static void main(String[] args)
    {
        System.out.println("Введите cторону  х" );
        Scanner var = new Scanner(System.in);
        int x = var.nextInt();
        System.out.println("Введите cторону  у" );
        int y = var.nextInt();
        System.out.println("Введите cторону  z" );
        int z = var.nextInt();
        System.out.println("Введите cторону  t" );
        int t = var.nextInt();
        System.out.println(area(x,y,z,t));
    }
}
