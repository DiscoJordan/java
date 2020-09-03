package part2.arraysofarrays.task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {


     System.out.println("Какое количество cтрок вы хотите добавить в матрицу?");
    Scanner MyVar = new Scanner(System.in);
    int str = MyVar.nextInt();
        System.out.println("Какое количество cтолбцов вы хотите добавить в матрицу?");
    int sto = MyVar.nextInt();
int    a = -1;
    int[] [] arr = new int[str][sto];

        for(int i = 0; i < str;i ++) {
        for (int j = 0; j < sto; j++) {
            System.out.println("введите элемент матрицы под номером :" + "[" + i + "]" + "[" + j + "]");

          do{ System.out.println("Введите неотрицательное число");
              a = MyVar.nextInt();}
            while (a < 0);

                arr[i][j] = a;

        }
    }
        System.out.println("ваша матрица выглядит так");
        for(int i = 0; i < str;i ++) {
        for (int j = 0; j < sto; j++) {


            System.out.print(arr[i][j] + "\t");
        }
        System.out.println(" ");

    }
int max = -1;
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j++) {
                       sum = sum +arr[j][i];
            }
            if(sum > max){
                max = sum;
                }
            sum =0;
        }

        for(int i = 0; i < str;i ++) {
            for (int j = 0; j < sto; j++) {
                sum2 = sum2 + arr[j][i];


                if (sum2 == max) {
                    int row = i + 1;
                    System.out.println("Номер ряда с самой большой суммой его чисел " + row);
                    row = i;
                }
            }
            sum2 =0;
        }
System.out.println("Сумма чисел в ряду равна " + max);

    }



}


