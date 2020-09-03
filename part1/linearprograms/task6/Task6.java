package part1.linearprograms.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("введите координату x:");
        Scanner myVar=new Scanner(System.in);
        int x = myVar.nextInt();
        System.out.println("введите координату y:");
        int y = myVar.nextInt();
        boolean f;
        if(x >= -4 && x<=4 &&y >= -4 && y <= 0){
             f =true;
        }
        else if(x >= -2 && x<=2 &&y >= 0 && y <= 4){
           f =true;}
        else {
             f = false;
        }
        System.out.println("ответ:" + f );
        }

}
