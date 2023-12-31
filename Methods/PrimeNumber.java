package Methods;
import java.util.*;
public class PrimeNumber {
    public static boolean isPrime(int n) {
        // corner cases
        if (n == 0 || n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else { // General Cases
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n+" is PRIME.");
        } else {
            System.out.println(n+" is NOT PRIME.");
        }
    }
}
