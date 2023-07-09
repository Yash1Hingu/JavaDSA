package Recursion;

public class FriendsPairs {
    public static int friendsPairs(int n){
        if(n == 1 || n == 2) {
            return n;
        }

        return friendsPairs(n-1) + (n-1)*friendsPairs(n-2);
    }
    public static void main(String args[]){
        System.out.println(friendsPairs(4));
    }
}
