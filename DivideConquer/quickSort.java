package DivideConquer;

public class quickSort {
	public static void quicksorting(int arr[],int si,int ei){
		// Base Case
		if(si >= ei) {
			return;
		}
		
		// Divide
		int piInx = partion(arr,si,ei);

		// Conquer - Recursive Call
		quicksorting(arr,si,piInx-1);
		quicksorting(arr,piInx+1,ei);
	}
	public static int partion(int arr[],int si,int ei) {
		int i = si - 1;
		int pivot = arr[ei];

		for(int j = si;j < ei;j++) {
			if(arr[j] <= pivot) {
			// for desading order arr[j] >= pivot
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		//swap pivot
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[ei] = temp;
		
		return i;
	}

	public static void print(int arr[]) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]){
		int arr[] = {5,4,3,2,1};
		quicksorting(arr,0,arr.length - 1);
		print(arr);
 	}    
}
