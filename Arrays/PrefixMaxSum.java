package Arrays;

public class PrefixMaxSum {
    public static void prefix(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;

        int prefixArr[] = new int[numbers.length];

        prefixArr[0] = numbers[0];
        
        for(int i = 1;i < numbers.length;i++) {
            prefixArr[i] = prefixArr[i-1] + numbers[i];
        }

        for(int i = 0;i < numbers.length;i++) {
            int start = i;
            for(int j = i;j < numbers.length;j++) {
                int end = j;
                int currSum = start == 0 ? prefixArr[end]:prefixArr[end] - prefixArr[start - 1];
                
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum : "+maxSum);
    } 
    public static void main(String args[]) {
        int numbers[] = {-1,2,5,-4,3};
        prefix(numbers);
    }
}
