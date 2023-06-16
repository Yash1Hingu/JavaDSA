import java.util.*;
public class Factorial {
    public static void main(String []args){
        int n;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        n = sc.nextInt();
        for(int i = 1;i <= n;i++) {
            factorial = factorial*i;
        }

        System.out.println("Factorial is : "+factorial);

    }
}
