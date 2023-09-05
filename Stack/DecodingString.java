import java.util.*;
public class DecodingString{
	public static String getDecodedString(String str){
		Stack<Integer> numStack = new Stack<>();
		Stack<Character> charStack = new Stack<>();
		String temp = "",result = "";

		for(int i = 0;i < str.length();i++){
			int count = 0;

			if(Character.isDigit(str.charAt(i))){
				
				while(Character.isDigit(str.charAt(i))){
					count = count * 10 + str.charAt(i) - '0';
					i++;
				}
				i--;
				numStack.push(count);

			} else if(str.charAt(i) == ']'){
				temp = "";
				count = 0;
				if(!numStack.isEmpty()){
					count = numStack.pop();
				}
				
				while(!charStack.isEmpty() && charStack.peek() != '['){
					temp = charStack.pop() + temp;
				}
				
				if(!charStack.isEmpty() && charStack.peek() == '['){
					charStack.pop();
				}

				for(int j = 0;j < count;j++){
					result = result + temp;
				}

				for(int j = 0;j < result.length();j++){
					charStack.push(result.charAt(j));
				}
				
				result = "";
				
			} else if(str.charAt(i) == '['){
			
				if(Character.isDigit(str.charAt(i-1))){
					charStack.push(str.charAt(i));
				} else {
					charStack.push(str.charAt(i));
					numStack.push(1);
				}

			} else {
				charStack.push(str.charAt(i));
			}
		}

		while(!charStack.isEmpty()){
			result = charStack.pop() + result;
		}

		return result;
	}
	public static void main(String args[]){
		String str = "3[b2[ac]]";
		System.out.println(getDecodedString(str));
	}
}