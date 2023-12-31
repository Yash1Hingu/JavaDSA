package Recursion.Practice;

public class NumberToWord {
    public static void numberToString(String str,int index){
        if(index == str.length()){
            return;
        }

        switch (str.charAt(index)) {
            case '0':
                System.out.print("Zero ");
                break;
            case '1':
                System.out.print("One ");
                break;
            case '2':
                System.out.print("Two ");
                break;
            case '3':
                System.out.print("Three ");
                break;
            case '4':
                System.out.print("Four ");
                break;
            case '5':
                System.out.print("Five ");
                break;
            case '6':
                System.out.print("Six ");
                break;
            case '7':
                System.out.print("Seven ");
                break;
            case '8':
                System.out.print("Eight ");
                break;
            case '9':
                System.out.print("Nine ");
                break;
        }

        numberToString(str, index+1);
    }
    public static void main(String args[]){
        Integer num = 54897520;
        numberToString(num.toString(), 0);
    }
}
