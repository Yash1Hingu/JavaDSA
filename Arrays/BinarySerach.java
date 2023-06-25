package Arrays;

public class BinarySerach {
    public static int binarySearch(int numbers[],int key) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            
            if(numbers[mid] == key) {
                // FOUND
                return mid;
            } else if(numbers[mid] > key) {
                // LEFT 1ST HALF
                end = mid - 1;
            } else{ // numbers[mid] < key
                // RIGHT 2ND HALF
                start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 1;
        int index = binarySearch(numbers,key);

        if(index == -1) {
            System.out.println("NOT Found");
        } else {
            System.out.println("Index Of key : "+index);
        }
    }
}
