package part2.decomposition.task13;


public class Task13 {
     public static void printSiblings(int n) {
        for(int i = n; i <= (2 * n - 2); i++){
            if (isSimple(i) && isSimple(i + 2)){
                System.out.println(i + " " + (i + 2));
                System.out.println();
            }
        }
    }

    public static boolean isSimple(int n) {
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        printSiblings(10 );
    }
}
