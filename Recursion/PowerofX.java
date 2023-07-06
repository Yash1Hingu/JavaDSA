package Recursion;

public class PowerofX {
    //O(n)
    public static double power(int x,int n) {
        //Base Condition
        if(n == 1) {
            return x;
        }
        //Recursive Call
        return x * power(x,n-1);
    }

    // O(logn)
    public static int optimizepow(int x,int n) {
        // Base Case 
        if(n == 1){
            return x;
        }
        if(n%2 == 0){
            return optimizepow(x, n/2) * optimizepow(x, n/2);
        }
        return x * optimizepow(x, n/2) * optimizepow(x, n/2);
    }
    public static void main(String args[]) {
        // System.out.println(power(2,10));
        System.out.println(optimizepow(2, 10));
    }
}
