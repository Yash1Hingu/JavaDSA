import java.util.*;
public class StackbyDeque{
	public static class Stack{
		static Deque<Integer> s = new LinkedList<Integer>();
		
		//isEmpty
		public static boolean isEmpty(){
			return s.isEmpty();
		}
		//push
		public static void push(int data){
			s.addLast(data);
		}
		
		//pop
		public static int pop(){
			return s.removeLast();
		}

		//peek
		public static int peek(){
			return s.getLast();
		}
	}
	public static void main(String args[]){
		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.push(3);

		System.out.println(s.peek());
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}
}