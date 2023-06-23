package Advance_StarPattern;

public class HollowRhombus {
    public static void hollowrhombus(int n) {
        // Line
        for(int i = 1;i <= n;i++) {
            // space
            for(int j = 1;j <= n-i;j++) {
                System.out.print(" ");
            }
            // star
            for(int j = 1;j <= n;j++) {
                if(j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        hollowrhombus(5);
    }
}
