public class Linkedlist{
	
	// Create Node
	public static class Node{
		int data;
		Node next; 
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;


	//addFirst
	public void addFirst(int data){
		//1. create new node
		Node newNode = new Node(data);

		//2. no linked list
		if(head == null){
			head = tail = newNode;
			return;
		}

		//2. newNode point head
		newNode.next = head;
		
		//3. head = newNode
		head = newNode;
	}

	//addLast
	public void addLast(int data){
		// create new node
		Node newNode = new Node(data);
		if(head == null){
			head = tail = newNode;
			return;
		}
		
		// tail point newNode
		tail.next = newNode;
		
		// tail = newNode
		tail = newNode;
	}

	public static void main(String args[]){
		Linkedlist li = new Linkedlist();
		li.addFirst(1);
		li.addFirst(2);
		li.addLast(4);
		li.addLast(5);
		System.out.println(tail.data);
	}
}