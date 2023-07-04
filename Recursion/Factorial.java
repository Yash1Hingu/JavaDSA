package Recursion;

public class Factorial {
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        int fnm1 = factorial(n-1);
        return n*fnm1;
    }
    public static void main(String args[]) {
        int n = 7;
        System.out.println(n+"! = "+factorial(n));
    }
}
