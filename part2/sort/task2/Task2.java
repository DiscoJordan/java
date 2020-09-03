package part2.sort.task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве n");
        int n = var.nextInt();
        System.out.println("Введите количество элементов в массиве m");
        int m = var.nextInt();

        System.out.println("Заполните первый массив");
        int a[] = new int[n + m];
        for (int i = 0; i < n; i++){
            System.out.println("Введите элемент: " + i);
            a[i] = var.nextInt();
        }
        System.out.println("Заполните второй массив");
        for (int i = 0; i <  m; i++){
            System.out.println("Введите элемент: " + i);
            a[n + i] = var.nextInt();
        }


int temp;
        for(int i = 0; i < m + n;i++){
            if(i + 1 < m + n){
            if (a[i] > a[i + 1]){
                temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
                i = 0;
            }}
        }
        if (a[0] > a[1]){
            temp = a[1];
            a[1] = a[0];
            a[0] = temp;
        }

        System.out.print("Получившийся массив: [");
        for (int i = 0; i < n + m; i++){
            if(i < n + m - 1){
                System.out.print(a[i] + ",");}
            else{
                System.out.print(a[i]);}
        }

        System.out.print("]");
    }

}
