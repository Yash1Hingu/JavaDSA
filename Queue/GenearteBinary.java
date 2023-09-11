//T.C. = O(n)
//S.C = O(n) use of queue
import java.util.*;
public class GenearteBinary{
	public static void genearteBinary(int n){
		//create queue of string type
		Queue<String> q = new LinkedList<>();
		
		//Add 1
		q.add("1");

		//loop for generte binary number and add in queue
		while(n-- > 0){
			//take front
			String str = q.peek();

			//print front
			System.out.println(str);

			//remove from queue
			q.remove();
		
			//add 0 , 1 after removed string
			q.add(str + "0");
			q.add(str + "1");
		}
	}
	public static void main(String args[]){
		int n = 5;
		genearteBinary(n);
	}
}