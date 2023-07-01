package Sorting;

public class SelectionSort {
    public static void selectionSort(int nums[]) {
        int n = nums.length;
        for(int i = 0;i < n;i++) {
            int smallest = i;
            for(int j = i+1;j < n;j++) {
                if(nums[smallest] > nums[j]) {
                    smallest = j;
                }
            }

            // swap
            int temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;
        }
    }
    public static void print(int nums[]) {
        for(int i = 0;i < nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String args[]) {
        int nums[] = {5,4,3,2,1};
        selectionSort(nums);
        print(nums);
    }
}
