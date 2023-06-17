package StarPattern;

public class Patternone {
    public static void main(String []args) {
        for(int line = 0;line < 5;line++) {
            for(int star = 0;star <= line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
