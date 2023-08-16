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

	// remove first
	public int removeFirst(){
		int val;
		if(size == 0){
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		} else if(size == 1){
			val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		val = head.data;
		head = head.next;
		size--;
		return val;
	}

	// remove last 
	public int removeLast(){
		if(size == 0){
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		} else if(size == 1){
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		
		// i = size -2
		Node prev = head;
		for(int i = 0;i < size -2;i++){
			prev = prev.next;
		}
		int val = prev.data;
		prev.next = null;
		size--;
		tail = prev;
		return val;
	}


	public int itrSerach(int key){
		Node temp = head;
		int idx = 0;
		while(temp != null){
			if(temp.data == key){
				return idx;
			}
			temp = temp.next;
			idx++;
		}
		return -1;
	}


	// TC : O(n) SC : O(n)[call stack]
	public int helper(Node head,int key){
		//base case
		if(head == null){
			return -1;
		}
		if(head.data == key){
			return 0;
		}

		// recursion call
		int idx = helper(head.next,key);
		
		// work
		if(idx == -1){
			return -1;
		}
		return idx+1;
	}
	public int recSerach(int key){
		return helper(head,key);
	}

	public void reverse(){
		Node prev = null;
		Node curr = head;
		Node next;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	public static void main(String args[]){
		Linkedlist li = new Linkedlist();
		li.addFirst(1);
		li.addFirst(2);
		li.addLast(4);
		li.addLast(5);
		li.add(3,7);
		li.print();
		li.removeFirst();
		li.print();
		System.out.println(li.size);
		li.removeLast();
		li.print();
		System.out.println(li.size);
		System.out.println(li.recSerach(5));
		li.reverse();
		li.print();
	}
}