package Arrays;

public class ReverseArray {
    public static void reverse(int number[]) {
        int first = 0;
        int last = number.length - 1;

        while(first < last) {
            int swap = number[first];
            number[first] = number[last];
            number[last] = swap;

            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14,16};

        reverse(numbers);
        for(int i = 0;i < numbers.length;i++) {
            System.out.print(numbers[i] +" ");
        }
        System.out.println();
    }
}
