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
	public static int size;

	//addFirst
	public void addFirst(int data){
		//1. create new node
		Node newNode = new Node(data);
		size++;

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
		size++;

		if(head == null){
			head = tail = newNode;
			return;
		}
		
		// tail point newNode
		tail.next = newNode;
		
		// tail = newNode
		tail = newNode;
	}

	//Print LinkedList
	public void print(){ // O(n)

		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" -->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	//add element on index
	public void add(int index,int data){
		if(index == 0){
			addFirst(data);
			return;
		}

		Node temp = head;
		int i = 0;
		Node newNode = new Node(data);
		size++;
		while(i < index-1){
			temp = temp.next;
			i++;
		}
		
		// i = index-1 --> temp = prev
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public static void main(String args[]){
		Linkedlist li = new Linkedlist();
		li.addFirst(1);
		li.addFirst(2);
		li.addLast(4);
		li.addLast(5);
		li.add(3,7);
		li.print();
		System.out.println(li.size);
	}
}