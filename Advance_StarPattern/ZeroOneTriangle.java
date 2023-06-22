package Advance_StarPattern;

public class ZeroOneTriangle {
    public static void zerooneTriangle(int n) {
        int zeroOne = 0;
        for(int i = 1;i <= n;i++) {
            for(int j = 1;j<=i;j++) {
                zeroOne = zeroOne == 1 ? 0 : 1;
                System.out.print(zeroOne+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        zerooneTriangle(5);
    }
}
