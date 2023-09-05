import java.util.*;
public class SimplifyPath{
	public static String getSimplifyPath(String str){
		String strArr[] = str.split("/");
		Stack<String> s = new Stack<>();
		
		for(int i = 0;i < strArr.length;i++){
			if(strArr[i].equals(".") || strArr[i].length() == 0){
				continue;
			} else if(strArr[i].equals("..")){
				if(!s.isEmpty()){
					s.pop();		
				}
			} else {
				s.push(strArr[i]);
			}
		}

		String ans = "";
		while(!s.isEmpty()){;
			ans = "/"+s.pop()+ans;
		}
		if(ans.length() == 0){
			ans = "/";
		}
		return ans;
	}
	public static void main(String args[]){
		String str = "/../abc//./def/";
		System.out.println(getSimplifyPath(str));
	}
}