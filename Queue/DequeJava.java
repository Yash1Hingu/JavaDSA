import java.util.*;
public class DequeJava{
	public static void main(String args[]){
		Deque<Integer> dq = new LinkedList<>();
		dq.addFirst(1);
		dq.addFirst(2);
		dq.addLast(4);
		dq.addLast(5);
		System.out.println(dq);
		dq.removeLast();
		System.out.println(dq);
		dq.removeFirst();
		System.out.println(dq);
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
	}
}