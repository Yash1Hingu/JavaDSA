import java.util.*;
public class ISPalindromeLL{
	public static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static boolean isPalindromell(Node head){
		Stack<Integer> s = new Stack<>();
		Node slow = head;

		while(slow != null){
			s.push(slow.data);
			slow = slow.next;	
		}

		while(head != null){
			int i = s.pop();
			if(head.data != i){
				return false;	
			}
			head = head.next;
		}
		return true;
	}
	public static void main(String args[]){
		Node firstNode = new Node(4);
		Node secoundNode = new Node(3);
		Node thirdNode = new Node(2);
		Node fourNode = new Node(1);
		Node fiveNode = new Node(2);
		Node sixNode = new Node(3);
		Node sevenNode = new Node(4);
		
		firstNode.next = secoundNode;
		secoundNode.next = thirdNode;
		thirdNode.next = fourNode;
		fourNode.next = fiveNode;
		fiveNode.next = sixNode;
		sixNode.next = sevenNode;

		if(isPalindromell(firstNode)){
			System.out.println("Linked List is Palindrome");
		} else {
			System.out.println("Linked List is Not a Palindrome");
		}
	}
}