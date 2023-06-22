package Advance_StarPattern;

public class InvertedHalfPyramid {
    public static void invertedHalfPyramid(int n) {
        // lines
        for(int i = 1;i <= n;i++) {
            // numbers
            for(int j = 1;j <= n-i+1;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        invertedHalfPyramid(10);
    }
}
