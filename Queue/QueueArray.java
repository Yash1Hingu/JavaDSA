public class QueueArray{
	public static class Queue{
		static int arr[];
		static int size;
		static int rear = -1;
		
		public Queue(int n){
			arr = new int[n];
			size = n;
		}

		// is Empty
		public static boolean isEmpty(){
			if(rear == -1){
				return true;
			}
			return false;
		}	
		//add
		public static void add(int data){
			//queue full
			if(rear == size){
				System.out.print("Queue Full");
				return;
			}

			rear++;
			arr[rear] = data;
		}

		//remove 
		public static int remove(){
			//queue empty
			if(rear == -1){
				return -1;
			}

			int data = arr[0];
			for(int i = 0;i < rear;i++){
				arr[i] = arr[i+1];
			}
			rear--;
			return data;
		}

		//peek
		public static int peek(){
			//queue is empty
			if(rear == -1){
				return -1;
			}
			
			return arr[0];
		}
	}

	public static void main(String args[]){
		Queue q = new Queue(3);
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()){
			System.out.println(q.peek());
			q.remove();
		}				
	}
}