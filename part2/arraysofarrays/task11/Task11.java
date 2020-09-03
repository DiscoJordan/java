package part2.arraysofarrays.task11;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        int str = 10;
        int sto = 20;
        int[] [] arr = new int[str][sto];
        Random rnd = new Random();




        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j++) {
                arr[i][j] = rnd.nextInt(16);
            }
        }
        System.out.println("ваша матрица выглядит так");
        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j++) {


                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");

        }
        int count = 0;

        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j++) {
                if(arr[i][j] == 5){
                    count++;}
                if (count == 3){
                    int string = i + 1;
                    System.out.println("'5' встречается три или более раза в строке " + string);
                    string = i;
                    count ++;
                }

            }
            count = 0;
        }
    }

}
