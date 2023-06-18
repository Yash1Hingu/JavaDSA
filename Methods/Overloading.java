package Methods;

public class Overloading {
    public static int sum(int a,int b){
        return a + b;
    }

    public static int sum(int a,int b,int c){
        return a + b + c;
    }

    public static void main(String []args){
        // call sum(a,b);
        System.out.println(sum(3,2));
        // call sum(a,b,c);
        System.out.println(sum(3,2,5));
    }
}
