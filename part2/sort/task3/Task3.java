package part2.sort.task3;
import java.util.Scanner;
public class Task3 {
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

        int temp;
        for(int i = 0; i < n / 2;i++){
                    temp = a[i];
                    a[i] = a[n - 1 -i];
                    a[n - 1 - i] = temp;

        }

        System.out.print("Получившийся массив: [");
        for (int i = 0; i < n; i++){
            if(i < n - 1 ){
                System.out.print(a[i] + ",");}
            else{
                System.out.print(a[i]);}
        }

        System.out.print("]");
    }


}
