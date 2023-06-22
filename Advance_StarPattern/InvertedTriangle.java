package Advance_StarPattern;
import java.util.Scanner;
public class InvertedTriangle {
    public static void invertedTriangle(int n) {
        // lines
        for(int i = 1;i <= n;i++) {
            // spaces
            for(int j = 1;j <= n-i;j++){
                System.out.print(" ");
            }
            // star
            for(int j = 1;j <= i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Lines ? ");
        int n = sc.nextInt();
        invertedTriangle(n);
    }
}
