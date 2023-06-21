package Methods.Practice;

public class SumofDigit {
    public static int sumofDigit(int n) {
        int sum = 0,digit;

        while(n > 0) {
            digit = n % 10;
            sum = sum + digit;
            n /= 10;
        }

        return sum;
    }
    public  static void main(String args[]) {
        System.out.println("Sum : "+sumofDigit(138));
    }
}
