public class ReverseNum {
    public static void main(String []args) {
        int n = 230804;
        int lastDigit = 0;
        while(n > 0) {
            lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }
        System.out.println();
    }
}
