import java.util.*;
public class MinCostRopes{
	public static int getMinCost(int arr[]){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0;i < arr.length;i++){
			pq.add(arr[i]);
		}
		
		int ans = 0;
		while(pq.size() > 1){
			int first = pq.poll();
			int secound = pq.poll();
			int sum = first + secound;
			ans += sum;
			pq.add(sum);
		}

		return ans;
	}
	public static void main(String args[]){
		int arr[] = {4, 3, 2, 6};
		System.out.println(getMinCost(arr));
	}
}