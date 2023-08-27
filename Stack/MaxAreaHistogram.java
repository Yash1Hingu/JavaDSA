import java.util.*;
public class MaxAreaHistogram{
	public static void getMaxAreaOfHistogram(int arr[]){
		int maxArea = 0;
		int nsl[] = new int[arr.length];
		int nsr[] = new int[arr.length];
		
		// next smaller left side
		Stack<Integer> s = new Stack<>();
		
		for(int i = 0;i < arr.length;i++){
			while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
				s.pop();
			}
			if(s.isEmpty()){
				nsl[i] = -1;
			} else {
				nsl[i] = s.peek();
			}
			s.push(i);
		}

		// next smaller right side
		s = new Stack<>();
			
		for(int i = arr.length-1;i >= 0;i--){
			while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
				s.pop();
			}
			if(s.isEmpty()){
				nsr[i] = arr.length;
			} else {
				nsr[i] = s.peek();
			}
			s.push(i);
		}

		// width find
		
		for(int i = 0;i < arr.length;i++){
			int height = arr[i];
			int width = nsr[i] - nsl[i] - 1;
			
			int currArea = width * height;
			maxArea = Math.max(currArea,maxArea);
		}

		System.out.println("Max Area is : "+maxArea);
 	}
	public static void main(String args[]){
		int arr[] = {2,1,5,6,2,3};
		getMaxAreaOfHistogram(arr);
 	}
}