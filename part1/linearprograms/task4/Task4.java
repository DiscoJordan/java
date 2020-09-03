package part1.linearprograms.task4;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("введите число формата nnn.ddd что-бы его перевернуть :");
       // Scanner myVar=new Scanner(System.in);
        //double x = myVar.nextDouble();
double x = 333.555;
        double res = (x * 1000) % 1000 + (int) x / 1000.0;


        System.out.println("Значение переменной  равно:" + res);




    }
}
