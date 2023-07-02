package String;
import java.util.Arrays;
public class AnagramsString {
    public static void isAnagramsString(String str1,String str2) {
        char str1CharArr[] = str1.toCharArray();
        char str2CharArr[] = str2.toCharArray();

        Arrays.sort(str1CharArr);
        Arrays.sort(str2CharArr);

        boolean result = Arrays.equals(str1CharArr,str2CharArr);

        if(result) {
            System.out.println("ANAGRMAS STRINGS");
        } else {
            System.out.println("NOT ANAGRMAS STRINGS");
        }
    }
    public static void main(String args[]) {
        String str1 = "care";
        String str2 = "race";

        isAnagramsString(str1, str2);
    }
}
