package Methods;
import java.util.*;

public class PrimeNumberRange {
    public static boolean primePrint(int n){
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int n = sc.nextInt();
        for(int i = 2;i <= n;i++) {
            if(primePrint(i)){
                System.out.print(i+" ");
            }
        }
    }
}
