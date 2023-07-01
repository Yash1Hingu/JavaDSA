package String;

public class Strings {
    public static void equalString() {
        String s1 = "Yash";
        String s2 = "Yash";
        String s3 = new String("Yash");

        // EQUAL
        if (s1 == s2) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }

        // NOT EQUAL
        if (s1 == s3) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }

        if (s1.equals(s3)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }

    public static void subString() {
        String str = "YashHingu";
        String substr = str.substring(2,6);
        System.out.println(substr);
    }

    public static void comparision() {
        String strarr[] = {"apple","mango","banana"};
        String largest = strarr[0];
        for(int i = 1;i < strarr.length;i++) {
            if(largest.compareTo(strarr[i]) < 0) {
                largest = strarr[i];
            }
        }

        System.out.println("Largest String in Lexicographic Order is "+largest);
    }

    public static void main(String args[]) {
        // subString();
        comparision();
    }
}
