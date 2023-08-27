import java.util.*;

public class NextGreaterEl{
	public static void nextgreater(int arr[],int nextGrt[]){
		Stack<Integer> s = new Stack<>();
		int n = arr.length;

		for(int i = n-1;i >= 0;i--){ 	
			int el = arr[i];
			while(!s.isEmpty() && s.peek() <= el) {
				s.pop();
			}
			if(s.isEmpty()){
				nextGrt[i] = -1;
			} else {
				nextGrt[i] = s.peek();
			}
			s.push(el);
		}
		
	}
	public static void main(String args[]){
		int arr[] = {6,8,0,1,3};
		int nextGrt[] = new int[arr.length];
		
		nextgreater(arr,nextGrt);

		for(int i = 0;i < nextGrt.length;i++){
			System.out.println(nextGrt[i]);
		}
	}
}