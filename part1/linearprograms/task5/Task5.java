package part1.linearprograms.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("введите число секунд  что-бы его перевеcти его в часовую форму :");
         Scanner myVar=new Scanner(System.in);
        int x = myVar.nextInt();
        //int x = 746;
        int h;
        int m;
        int s;
        h = x / 3600;
        m = (x - (h * 3600)) / 60;
        s =( x - (h * 3600)- (m * 60)) ;




        System.out.println( h + "ч" + m + "м" + s +"с");



    }
}
