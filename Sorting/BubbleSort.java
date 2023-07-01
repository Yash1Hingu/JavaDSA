package Sorting;

public class BubbleSort {
    public static void bubblesort(int arr[]) {
        int n = arr.length;
        for(int t = 0;t < n-1;t++) {
            int swap = 0; // For Best Case
            for(int j = 0;j < n-t-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0){
                break;
            }
        }
    }
    public static void main(String args[]) {
        int nums[] = {1,2,3,4,5};
        bubblesort(nums);

        for(int i = 0;i < nums.length;i++) {
            System.out.print(nums[i]);
        }
    }
}
