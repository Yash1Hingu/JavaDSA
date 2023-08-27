import java.util.*;
public class StackJCF{
	public static void main(String args[]){
		Stack<Integer> st = new Stack<>();
		System.out.println(st.isEmpty());
		st.push(3);
		st.push(2);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
	}
}