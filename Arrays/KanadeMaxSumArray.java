package Arrays;
import java.util.*;
public class KanadeMaxSumArray {
    public static void kanades(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i < numbers.length;i++) {
            currSum = currSum + numbers[i];
            if(currSum < 0) {
                currSum = 0;
            }
            if(maxSum < currSum) {
                maxSum = currSum;
            }
        }

        System.out.println("Max Sum : "+maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kanades(numbers);
    }
}