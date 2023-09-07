import java.util.*;
public class TwoQueueStack{
	public static class StackQ{
		static Queue<Integer> q1 = new LinkedList<>();
		static Queue<Integer> q2 = new LinkedList<>();
		
		//Is Empty
		public static boolean isEmpty(){
			return q1.isEmpty() && q2.isEmpty();
		}

		//Push
		public static void push(int data){
			if(!q1.isEmpty()){
				q1.add(data);
			} else {
				q2.add(data);
			}
		}

		//pop
		public static int pop(){
			if(isEmpty()){
				System.out.println("Stack is Empty");
				return -1;
			}

			int top = -1;
			
			//Case 1 : q1 containe Elements and q2 not containe ele.
			if(!q1.isEmpty()){
				while(!q1.isEmpty()){
					top = q1.remove();
					if(q1.isEmpty()){
						break;
					}
					q2.add(top);
				}
			} else { //Case 2 : q1 not containe ele and q2 conatine ele.
				while(!q2.isEmpty()){
					top = q2.remove();
					if(q2.isEmpty()){
						break;
					}
					q1.add(top);
				}
			}

			return top;
		}

		//peek
		public static int peek(){
			if(isEmpty()){
				System.out.println("Stack is Empty");
				return -1;
			}

			int top = -1;
			
			//Case 1 : q1 containe Elements and q2 not containe ele.
			if(!q1.isEmpty()){
				while(!q1.isEmpty()){
					top = q1.remove();
					q2.add(top);
				}
			} else { //Case 2 : q1 not containe ele and q2 conatine ele.
				while(!q2.isEmpty()){
					top = q2.remove();
					q1.add(top);
				}
			}
			// add all ele in empty queue.

			return top;
		}
	}
	public static void main(String args[]){
		StackQ s = new StackQ();

		s.push(1);
		s.push(2);
		s.push(3);

		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
	}
}