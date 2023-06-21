package Methods.Practice;
import java.util.Scanner;
public class Even {
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isEven(n)) {
            System.out.println("Number " + n + " is EVEN");
        } else {
            System.out.println("Number " + n + " is ODD");
        }
    }
}
