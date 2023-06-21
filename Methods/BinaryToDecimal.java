package Methods;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        int n = sc.nextInt();
        double dec = 0,pow = 0;
        int ld;

        while(n > 0) {
            ld = n % 10;
            dec = dec + (ld*(Math.pow(2,pow)));
            n = n/10;
            pow++;
        }

        System.out.println(dec);
    }
}
