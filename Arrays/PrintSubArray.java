package Arrays;

public class PrintSubArray {
    public static void subString(int number[]) {
        for(int i = 0;i < number.length;i++) {
            for(int j = i;j < number.length;j++) {
                System.out.print("(");
                for(int k = i;k <= j;k++) {
                    System.out.print(k+",");
                }
                System.out.print(") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        subString(numbers);
    }
}
