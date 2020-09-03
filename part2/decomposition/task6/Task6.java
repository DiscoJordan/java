package part2.decomposition.task6;

public class Task6 {
    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        if (n > m) {
            return gcd(m, n - m);
        } else {
            return gcd(n, m - n);
        }
    }

    public static boolean comprimenumbers(int a, int b, int c){
        return (gcd(a, b) == 1 && gcd(a, c) == 1 && gcd(b, c) == 1) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(comprimenumbers(5,3,7));
    }
}
