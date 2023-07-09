package Recursion;

public class RemoveDuplicate {
    public static void removeDuplicate(String str,int idx,StringBuilder sb,boolean map[]) {
        //Base Case
        if(idx == str.length()) {
                return;
        }

        //Recursive Call
        char strChar = str.charAt(idx);
        if(map[strChar - 'a']){
            // map true --> skip char
            removeDuplicate(str,idx+1,sb,map);
        } else {
            // map false --> append char
            map[strChar - 'a'] = true;
            removeDuplicate(str,idx+1,sb.append(strChar),map);
        }
    }
    public static void main(String args[]) {
        String str = "aaapaaanaaaccccooolleeegeee";
        StringBuilder sb = new StringBuilder();
        boolean map[] = new boolean[26];
        int idx = 0;
        removeDuplicate(str,idx,sb,map);
        System.out.println(sb);
    }
}
