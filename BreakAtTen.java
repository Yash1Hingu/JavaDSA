import java.util.*;
public class BreakAtTen {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        do{
            int number = sc.nextInt();
            if(number % 10 == 0){
                break;
            }
            System.out.println("Number is : "+number);
        }while(true);

        System.out.println("Loop Break!!");
    }
}
