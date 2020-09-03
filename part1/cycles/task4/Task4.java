
package part1.cycles.task4;
import java.math.BigInteger;
public class Task4 {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("1");
        for (int i = 1; i <= 200; i++){
            sum = sum.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(sum);
    }
}
