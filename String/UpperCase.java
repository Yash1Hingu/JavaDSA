package String;

public class UpperCase {
    public static StringBuilder upperCase(String str) {
        StringBuilder sb = new StringBuilder();

        int n = str.length();
        sb.append(Character.toUpperCase(str.charAt(0)));
        
        for(int i = 1;i < n;i++) {
            char strChar = str.charAt(i);
            if(strChar == ' ' && i < n-1) {
                sb.append(strChar);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(strChar);
            }
        }

        return sb;
    }
    public static void main(String args[]) {
        String str = "hi, i am yash";
        System.out.println("UpperCase : " + upperCase(str));
    }
}
