// String Question 1

package String;
import java.util.Scanner;
public class VowelCounter {
    public static int getVowelCount(String str) {
        int count = 0;
        for(int i = 0;i < str.length();i++) {
            char strChar = str.charAt(i);
            if(strChar == 'a' || strChar == 'e' || strChar == 'i' || strChar == 'o' || strChar == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Vowels Count : "+getVowelCount(str));
    }
}
