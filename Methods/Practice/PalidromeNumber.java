package Methods.Practice;
import java.util.Scanner;

public class PalidromeNumber {
    public static void palidromeNumber(int n) {
        int num = n;
        int rev = 0,digit = 0;

        while(n > 0) {
            digit = n % 10;
            rev = rev*10 + digit;
            n /= 10;
        }

        if(num == rev) {
            System.out.println("PALIDROME");
        } else {
            System.out.println("NOT PALIDROME");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        palidromeNumber(n);
    }
}
