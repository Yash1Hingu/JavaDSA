package Recursion;
public class BinarayString {
    public static void binaryString(int n,int lastitem,String str){
        // Base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //Work
        binaryString(n-1,0,str+"0");
        if(lastitem == 0){
            binaryString(n-1,1,str+"1");
        }
    }
    public static void main(String arg[]){
        binaryString(3,0,"");
    }
}
