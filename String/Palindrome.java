package String;
public class Palindrome{
    public static boolean isPalidrome(String str) {
        int n = str.length();
        for(int i = 0;i < n/2;i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]) {
        String str = "racecar";
        if(isPalidrome(str)) {
            System.out.println(str+" is PALIDROME");
        } else {
            System.out.println(str+" is NOT PALIDROME");
        }
    }
}