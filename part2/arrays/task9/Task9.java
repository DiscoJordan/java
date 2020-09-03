package part2.arrays.task9;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        System.out.println("Какое количество элементов вы хотите добавить в массив?");
        Scanner MyVar = new Scanner(System.in);
        int n = MyVar.nextInt();
        int[] arr = new int[n];


        int maxcount = 0;
        int count = 0;
        int minnumber = -2147483647;
        boolean isChecked[] = new boolean[n];
        for (int k = 0; k < n; k++) {
            System.out.println("введите элемент массива под номером :" + k);
            int a = MyVar.nextInt();
            arr[k] = a;}

        for (int i = 0; i < n; i++){
            if (isChecked[i]){
                continue;
            }
            for (int j = i; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    isChecked[j] = true;
                }
            }
            if (count > maxcount){
                maxcount = count;
                minnumber = arr[i];
            } else if (count == maxcount){
                if (minnumber > arr[i]){
                    minnumber = arr[i];
                }
            }
            count = 0;
        }

        System.out.println( "Ответ: " + minnumber);
    }
}
