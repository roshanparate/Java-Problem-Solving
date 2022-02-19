package problem.solving.recursion;

public class IsPalindromeString {

	public static void main(String[] args) {
		String s = "abba";
		System.out.println(palindrome(s, 0, s.length()-1));
	}
	
	static boolean palindrome(String s, int l , int r) {
		if(l<=r)
			return true;
		
		if(s.charAt(r) != s.charAt(l))
			return false;
		
		return palindrome(s, l+1, r-1);
	}
}
