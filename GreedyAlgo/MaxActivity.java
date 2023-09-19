import java.util.*;
public class MaxActivity{
	public static void main(String args[]){
		int start[] = { 1, 3, 0, 5, 8, 5};
		int end[] = { 2, 4, 6, 7, 9, 9};
		
		int maxAct = 0;
		ArrayList<Integer> list = new ArrayList<>();
		

		//1st Activity 
		maxAct = 1;
		list.add(0);
		int lastend = end[0];
		
		for(int i = 1;i < end.length;i++){
			if(start[i] >= lastend){
				maxAct++;
				list.add(i);
				lastend = end[i];
			}
		}

		System.out.println("Max : "+maxAct);
	}
}