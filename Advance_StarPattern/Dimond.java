package Advance_StarPattern;

public class Dimond {
    public static void dimond(int n) {
        // 1st Half
        for(int i = 1;i <= n;i++) {
            // space
            for(int sp = 1;sp <= n-i;sp++) {
                System.out.print(" ");
            }
            // star 
            for(int st = 1;st <= 2*i-1;st++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half
        for(int i = n;i >= 1;i--) {
            // space
            for(int sp = 1;sp <= n-i;sp++) {
                System.out.print(" ");
            }
            // star 
            for(int st = 1;st <= 2*i-1;st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void main(String args[]) {
        dimond(5);
    }
}
