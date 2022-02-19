package problem.solving.math;

public class TrailingZerosInFactorialOfNumber {

	public static void main(String[] args) {
		System.out.println(findTrailingZerosInFactorial(20));
	}
	
	/*
	 * To find Trailing Zero we need to find how Zeros coming in result
	 * result from 2*5 getting Zeros so we need to find how many 2*5 in factorial
	 * so formula will be like 
	 * 
	 * res = n/25+ n/125 + n/625..........
	 * 
	 * */
	public static int findTrailingZerosInFactorial(int num) {
		int res =0;
		for(int i=5; i<=num; i=i*5) {
			res =res +(num/i);
		}
		return res;
	}
}
