package Recursion;

public class PowerofX {
    public static double power(int x,int n) {
        //Base Condition
        if(n == 1) {
            return x;
        }
        //Recursive Call
        return x * power(x,n-1);
    }
    public static void main(String args[]) {
        System.out.println(power(2,10));
    }
}
