package problem.solving.recursion;

import java.util.ArrayList;

public class PowerSetOfString {

	static ArrayList<String> set = new ArrayList<>();
	
	public static void main(String[] args) {
		String s = "abc";
		powerSet(s, 0, "");
		
		System.out.println(set);
	}
	
	static void powerSet(String s, int l , String cur) {
		
		if(l == s.length()) {
			set.add(cur);
			return;
		}
		
		powerSet(s, l+1, cur+s.charAt(l));
		powerSet(s, l+1, cur);
	}
}
