public class StackLL{
	static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static class Stack{
		static Node head = null;
		
		//Stack Is Empty or Not
		public static boolean isEmpty(){
			return head == null;
		}

		//Push
		public static void push(int data){
			Node newNode = new Node(data);
			if(head == null){
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		//pop
		public static int pop(){
			if(head == null){
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}
	
		//peek
		public static int peek(){
			if(head == null){
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String args[]){
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push(1);
		System.out.println(st.peek());
		st.push(2);
		System.out.println(st.peek());
	}
}