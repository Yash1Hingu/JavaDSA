package Methods;
import java.util.*;

public class BinomialCoefficient{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i <= n;i++){
            f *= i;
        }
        return f;
    }

    public static int binomialCoefficient(int n,int r){
        if(n < r){
            return -1;
        }
        int bc = factorial(n) / (factorial(r) * factorial(n-r));

        return bc;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value for nCr n r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binomialCoefficient(n, r));
    }
}