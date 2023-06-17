import java.util.*;
public class PrimeNumber {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        for(int i = 2;i < number-1;i++){
            if(number % i == 0) {
                flag = true;
                break;
            }
        }

        if(flag) {
            System.out.println("Number is NOT PRIME");
        } else {
            System.out.println("Number is PRIME");
        }
    }
}
