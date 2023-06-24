package Arrays;
import java.util.*;

public class Percentage {
    public static void percentage(){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];

        for(int i = 0;i < 3;i++) {
            System.out.print("Marks["+i+"] = ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Maths : "+marks[0]);
        System.out.println("Physicas : "+marks[1]);
        System.out.println("Chemistry : "+marks[2]);

    }
    public static void main(String args[]) {
        percentage();
    }
}
