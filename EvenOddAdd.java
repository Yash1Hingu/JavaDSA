import java.util.*;
public class EvenOddAdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oddSum = 0 ,evenSub = 0,n;
        System.out.println("How Many Terms Enter ?");
        n = sc.nextInt();
        for(int i = 1;i <= n;i++){
            if(i % 2 == 0){
                evenSub = evenSub + i;
            } else {
                oddSum = oddSum + i;
            }
        }

        System.out.println("Sum Of Even : "+evenSub);
        System.out.println("Sum Of Odd : "+oddSum);
    }
}
