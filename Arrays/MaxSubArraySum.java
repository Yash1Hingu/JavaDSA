package Arrays;
import java.util.*;
public class MaxSubArraySum {
    public static void maxsubarraysum(int number[]) {
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i < number.length;i++) {
            for(int j = i;j < number.length;j++) {
                int currSum = 0;

                for(int k = i;k <= j;k++) {
                    currSum += number[i];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum : "+maxSum);
    }
    public static void main(String args[]) {
        int number[] = {2,4,-1,8,-4,12,14,-3,18};
        maxsubarraysum(number);
    }
}
