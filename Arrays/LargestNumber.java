package Arrays;
import java.util.*;

public class LargestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0;i < numbers.length;i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {1,3,5,7,2,9};
        System.out.println("Largest Number : "+getLargest(numbers));
    }
}
