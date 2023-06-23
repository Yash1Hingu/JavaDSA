package Advance_StarPattern;

public class NumberPyramid {
    public static void numberPyramid(int n) {
        // Lines
        for(int i = 1;i <= n;i++) {
            // space
            for(int j = 1;j <= n-i;j++) {
                System.out.print(" ");
            }
            // Number
            for(int j = 1;j <= i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        numberPyramid(9);
    }
}
