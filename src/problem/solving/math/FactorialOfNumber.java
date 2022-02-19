package problem.solving.math;

public class FactorialOfNumber {

	public static void main(String arg[]) {
		System.out.println(factorial(20));
		System.out.println(factorialUsingRecursion(20));
	} 
	
	/* formula to calculate factorial
	 * n! = 1*2*3*2.....*n 
	 * 
	 * */
	public static long factorial(int num) {
		long fac=1;
		for(int i=2; i<=num; i++) {
			fac = fac * i;
		}
		return fac;
	}
	
	public static long factorialUsingRecursion(int n) {
	    if (n <= 2) {
	        return n;
	    }
	    return n * factorialUsingRecursion(n - 1);
	}
}
