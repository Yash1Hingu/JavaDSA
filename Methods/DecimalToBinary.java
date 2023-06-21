package Methods;
import java.util.Scanner;
public class DecimalToBinary {
    public static int decimalBinary(int n){
        int binary = 0;
        int digit = 0,pow = 0;

        while(n > 0){
            digit = n % 2;
            binary = binary + (digit * ( (int)Math.pow(10,pow) ) );
            n /= 2;
            pow++;
        }

        return binary;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number : ");
        int n = sc.nextInt();
        System.out.println(decimalBinary(n));
    }
}
