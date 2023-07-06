package Recursion;

public class FirstOccurance {
    public static int firstOccurance(int arr[],int i,int key) {
        // Base Case
        if(i == arr.length - 1) {
            return -1;
        }
        // Base Case & Comparison(Work)
        if(arr[i] == key) {
            return i;
        }
        // Recursive Case
        return firstOccurance(arr, i+1, key);
    }
    public static void main(String args[]) {
        int arr[] = {1,2,5,6,3,7,3};
        int key = 3;
        System.out.println("Fisrt Occurance : "+firstOccurance(arr, 0, key));
    }
}
