import java.util.ArrayList;
public class StackB{
	public static class Stack{
		static ArrayList<Integer> li = new ArrayList<>();
		
		// Check Stack is Empty or Not
		public static boolean isEmpty(){
			if(li.size() == 0){
				return true;
			}
			return false;
		}

		//Push
		public static void push(int data){
			li.add(data);
		}

		//Pop
		public static int pop(){
			if(li.isEmpty()){
				return -1;
			}
			int top = li.get(li.size() - 1);
			li.remove(li.size() - 1);
			return top;
		}

		//peek
		public static int peek(){
			if(li.isEmpty()){
				return -1;
			}
			int top = li.get(li.size() - 1);
			return top;
		}
	}
	public static void main(String args[]){
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		System.out.println(st.peek());
		st.push(1);
		System.out.println(st.peek());
		st.push(2);
		System.out.println(st.peek());
		st.push(3);
		System.out.println(st.peek());
	}
}