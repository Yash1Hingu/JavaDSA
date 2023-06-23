package Advance_StarPattern;

public class ButterFlyPattern {
    public static void butterFly(int n){
        // 1st half
        for(int i = 1;i <= n;i++) {
            // pattern
            for(int j = 1;j <= i;j++) {
                System.out.print("*");
            }
            for(int j = 1;j <= 2*(n-i);j++) {
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i >= 1;i--) {
            // pattern
            for(int j = 1;j <= i;j++) {
                System.out.print("*");
            }
            for(int j = 1;j <= 2*(n-i);j++) {
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        butterFly(10);
    }
}
