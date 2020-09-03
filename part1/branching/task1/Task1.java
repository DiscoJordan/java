package part1.branching.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("введите градусную меру первого угла :");
        Scanner myVar=new Scanner(System.in);
        int x = myVar.nextInt();
        System.out.println("введите градусную меру первого угла :");
        int y = myVar.nextInt();
        if(x + y <= 180){
            System.out.println("Такой треугольник существует");

        if(x + y == 90 || x == 90 || y == 90){
            System.out.println("Этот треугольник прямоугольный");
        }
        else{
            System.out.println("Этот треугольник  НЕ прямоугольный");
        }}
        else{
            System.out.println("Этого треугольника не существует");
        }


    }}
