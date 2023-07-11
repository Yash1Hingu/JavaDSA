package Recursion.Practice;

public class OccurenceOfNum {
    public static void occurenceofnum(int arr[],int index,int key){
        //Base Case
        if(index == arr.length) return;

        //Work
        if(arr[index] == key){
            System.out.print(index+ " ");
        }

        occurenceofnum(arr,index+1,key);
    }
    public static void main(String args[]){
        int arr[] = {2,3,5,6,3,5,6,3,8,3,2};
        occurenceofnum(arr,0,3);
    }
}
