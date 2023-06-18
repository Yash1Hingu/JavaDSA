package Methods;
import java.util.*;
public class Factorials {
    public static int factorial(int n){
        int factorial = 1;
        for(int i = 1;i <= n;i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.println(n+"! = "+factorial(n));
    }
}
