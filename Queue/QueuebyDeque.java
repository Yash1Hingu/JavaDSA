import java.util.*;
public class QueuebyDeque{
	static class Queue{
		static Deque<Integer> q = new LinkedList<>();

		//add
		public static void add(int data){
			q.addLast(data);
		}
		
		//remove
		public static int remove(){
			return q.removeFirst();
		}

		//peek
		public static int peek(){
			return q.getFirst();
		}
	}
	public static void main(String args[]){
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());	
	}	
}