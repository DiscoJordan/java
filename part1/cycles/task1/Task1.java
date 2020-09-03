package part1.cycles.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int x;
       do {
           System.out.println("Введите любое целое положительное число");
           Scanner MyVar = new Scanner(System.in);
           x = MyVar.nextInt();


       }while (x<=0);
    int i;
    int r=0;
    for(i=0;i<=x;i++)
    {
         r =r+i;
    }
    System.out.println("Ответ:" + r);
}}
