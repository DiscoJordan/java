package part2.decomposition.task7;

public class Task7 {
    public static int factorial(int a) {
        return (a > 0) ? a * factorial(a - 1) : 1;
    }

    public static int specialfactorial() {
        int result = 0;
        for (int i = 1; i <= 9; i += 2) {
            result += factorial(i);
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(specialfactorial());
    }
}