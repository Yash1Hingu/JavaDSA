public class CircularQueueArray{
	public static class CircularQueue{
		static int arr[];
		static int size;
		static int rear;
		static int front;

		public CircularQueue(int n){
			arr = new int[n];
			size = n;
			front = -1;
			rear = -1;
		}

		// is Empty
		public static boolean isEmpty(){
			if(rear == -1){
				return true;
			}
			return false;
		}	

		// is Full
		public static boolean isFull(){
			if((rear+1)%size == front){
				return true;
			}
		
			return false;
		}
		
		//add
		public static void add(int data){
			//queue full
			if(isFull()){
				System.out.print("Queue Full");
				return;
			}

			if(front == -1){
				front = 0;
			}
			rear = (rear+1)%size;
			arr[rear] = data;
		}

		//remove 
		public static int remove(){
			//queue empty
			if(isEmpty()){
				return -1;
			}

			int result = arr[front];
			if(front == rear){
				front = rear = -1;
			} else {
				front = (front + 1)%size;
			}
			return result;
		}

		//peek
		public static int peek(){
			//queue is empty
			if(isEmpty()){
				return -1;
			}
			
			return arr[front];
		}
	}

	public static void main(String args[]){
		CircularQueue q = new CircularQueue(3);
		q.add(1);
		q.add(2);
		q.add(3);
		q.remove();
		q.add(4);
		q.remove();
		q.add(5);
		while(!q.isEmpty()){
			System.out.println(q.peek());
			q.remove();
		}				
	}
}