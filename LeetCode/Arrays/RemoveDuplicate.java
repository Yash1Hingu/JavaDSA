package LeetCode.Arrays;
/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */
public class RemoveDuplicate {
    public static int removeDuplicate(int nums[]) {
        int j = 1;
        for(int i = 1;i < nums.length;i++) {
            if(nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        } 
        return j;
    }
    public static void main(String args[]) {
        int nums[] = {0,0,1,1,1,2,2,3};
        int n = removeDuplicate(nums);
        for(int i = 0;i < n; i++) {
            System.out.print(nums[i]+ " ");
        }
    }
}
