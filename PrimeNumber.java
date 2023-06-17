import java.util.*;
public class PrimeNumber {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        for(int i = 2;i < number-1;i++){
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Number is PRIME");
        } else {
            System.out.println("Number is NOT PRIME");
        }
    }
}
