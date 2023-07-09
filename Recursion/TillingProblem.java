package Recursion;

public class TillingProblem {
    public static int tillingWay(int n) { // 2 x n
        //Base Case
        if(n == 0 || n == 1) {
            return 1;
        }
        //Recursive Call
        int verticalChoice = tillingWay(n-1);
        int horizontalChoice = tillingWay(n-2);
        return verticalChoice + horizontalChoice;
    }
    public static void main(String args[]) {
        int n = 3;
        System.out.println("Ways : "+tillingWay(n));
    }
}
