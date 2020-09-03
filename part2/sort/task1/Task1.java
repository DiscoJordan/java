package part2.sort.task1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Введите длину первого массива: ");
        int n = var.nextInt();
        System.out.println("Введите длину второго массива: ");
        int m = var.nextInt();
        System.out.println("Введите 'k':");
        int k = var.nextInt();

        System.out.println("Заполните первый массив");
        int a[] = new int[n + m];
        for (int i = 0; i < n; i++){
            System.out.println("Введите элемент: " + i);
            a[i] = var.nextInt();
        }

        System.out.println("Заполните второй массив");
        int b[] = new int[m];
        for (int i = 0; i < m; i++){
            System.out.println("Введите элемент: " + i);
            b[i] = var.nextInt();
        }

        boolean bo = true;
        for (int i = 0; i < m; i++){
            if (bo){
                for (int j = k + 1; j < n; j++){
                    a[m + j ] = a[j];
                }
                bo = false;
            }
            a[k + i + 1] = b[i];
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
