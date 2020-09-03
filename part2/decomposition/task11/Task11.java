package part2.decomposition.task11;

import java.util.Scanner;

public class Task11 {
    public static void max(int x,int y){
        int countx = 0 ;
        int county = 0 ;
        int yy = y;
        int xx = x;

        while (yy >= 1){
            yy = yy / 10;
            county ++;
        }
        while (xx >= 1){
           xx = xx / 10;
            countx ++;
        }

        int maximum = 0;
        if(countx > county){
            maximum = x;
            System.out.println(maximum);
        }
        if(countx == county){
            System.out.println("В этих числах количество цифр равно");



        }
        if(countx < county){
            maximum = y;
            System.out.println(maximum);
        }




    }
    public static void main(String[] args) {
        System.out.println("Введите два числа ");
        Scanner var = new Scanner(System.in);
        int x = var.nextInt();
        int y = var.nextInt();
        System.out.println("Больше чифр в числе : ");
        max(x,y);





    }
}
