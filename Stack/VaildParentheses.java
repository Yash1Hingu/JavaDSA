import java.util.*;
public class VaildParentheses{
	public static boolean isPair(char ch1,char ch2){
		if((ch1 == '(' && ch2 == ')') ||
		(ch1 == '{' && ch2 == '}') ||
		(ch1 == '[' && ch2 == ']')){
			return true;
		} else {
			return false;
		}
	}
	public static boolean isVaildParentheses(String str){
		Stack<Character> s = new Stack<>();
		
		for(int i = 0;i < str.length();i++){
			char ch = str.charAt(i);
			
			//Opening Bracket
			if(ch == '(' || ch == '{' || ch == '['){
				s.push(ch);	
			} else { // Closing Bracket
				
				if(s.isEmpty()){ // CASE : ")))"
					return false;
				}

				char top = s.peek();
				if(isPair(top,ch)){
					s.pop();
				} else {
					return false;
				}
			}
		}
		
		if(s.isEmpty()){
			return true;
		} else {
			return false;
		}
		
	}
	public static void main(String args[]){
		String str = "))";
		
		if(isVaildParentheses(str)){
			System.out.println("VAILD");
		} else {
			System.out.println("INVAILD");
		}
	}
}