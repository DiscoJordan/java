package part2.sort.task4;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int n = var.nextInt();


        System.out.println("Заполните первый массив");
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введите элемент: " + i);
            a[i] = var.nextInt();
        }


int count = 0;
        int temp;
        for(int i = 0; i < n;i++){
            if(i + 1 < n){
                if (a[i] > a[i + 1]){
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    count++;
                    i = 0;
                }}

        }
        if (a[0] > a[1]){
            temp = a[1];
            a[1] = a[0];
            a[0] = temp;
            count++;
            }


        System.out.print("Получившийся массив: [");
        for (int i = 0; i < n; i++){
            if(i < n - 1){
                System.out.print(a[i] + ",");}
            else{
                System.out.print(a[i]);}
        }

        System.out.print("]");
        System.out.print("Кол-во замен: " + count);
    }

}

