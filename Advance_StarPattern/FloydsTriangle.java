package Advance_StarPattern;

public class FloydsTriangle {
    public static void flyodsTriangle(int n) {
        // lines
        int count = 1;
        for(int i = 1;i <= n;i++) {
            // number
            for(int j = 1;j <= i;j++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        flyodsTriangle(10);
    }
}
