package DivideConquer;

public class mergeSort {
	public static void mergesorting(int arr[],int si,int ei){
		//Base Case
		if(si >= ei){
			return;
		}

		//Work
		//Divide
		int mid = si + (ei-si)/2;
		mergesorting(arr,si,mid);
		mergesorting(arr,mid+1,ei);

		//Conquer
		merge(arr,si,mid,ei);
	}
	public static void merge(int arr[],int si,int mid,int ei){
		int i = si; // inx for 1st sorted part
		int j = mid+1; // inx for 2nd sorted part
		int temp[] = new int[ei-si+1]; // store sorted part
		int k = 0; // iterator for temp arr
		
	
		while(i <= mid && j <= ei){
			if(arr[i] < arr[j]){
				temp[k++] = arr[i++];
			} else{
				temp[k++] = arr[j++];
			}
		}

		while(i <= mid){
			temp[k++] = arr[i++];	
		}
		while(j <= ei){
			temp[k++] = arr[j++];
		}
		

		//Copy Elements
		for(k = 0,i = si;k < temp.length;k++,i++) {
			arr[i] = temp[k];
		}
 	}
	public static void print(int arr[]){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int arr[] = {5,4,3,2,1};
		mergesorting(arr,0,arr.length - 1);
		print(arr);
	}
}
