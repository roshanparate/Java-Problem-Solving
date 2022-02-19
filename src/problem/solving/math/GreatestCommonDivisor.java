package problem.solving.math;

public class GreatestCommonDivisor {

	/*Greatest Common Divisor
	 * 
	 * GCD(A,B) = gcd(A-B,B) till A>B
	 *            ||
	 * GCD(A,B) = GCD(B, A%B) , B!=0
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println(gcd(24, 60));
	}
	
	static int gcd(int num1, int num2) {
		if(num2 ==0) return num1;

		return gcd(num2, num1%num2);
	}

}
