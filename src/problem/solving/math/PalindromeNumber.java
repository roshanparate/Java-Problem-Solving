package problem.solving.math;

public class PalindromeNumber {
	
	public static void main(String arg[]) {
		System.out.println(checkPalindromeNumber(202));
	}

	private static boolean checkPalindromeNumber(int num) {
		int rem,rev=0;
		int temp=num;
		while(num>0) {
			rem = num % 10;
			rev = (rev * 10)+rem;
			num = num/10; 		
		}
		if(temp==rev) {
			return true;
		}else {
			return false;
		}
	} 
}
