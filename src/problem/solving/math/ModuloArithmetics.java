package problem.solving.math;

public class ModuloArithmetics {


	public static void main(String[] args) {
		System.out.println(fastPower(3, 5));
		System.out.println(moduloArith(3978432, 5, 1000000007));

	}
	
	/*
	 * 					  A^B 
	 *			           ||
	 *		if B is Even        if B is Odd
	 * 		(A^2)^(B/2)         A*(A^B-1)
	 * 
	 * */
	static int fastPower(int a, int b) {
		int res=1;
		
		while(b > 0) {
			if((b&1) !=0) {
				res = res * a;
			}
			a= a*a;
			b= b >>1;
		}
		return res;
	}
	
	/*
	 * 	(a+b) % n = (a%n + b%n) % n
	 * 
	 *  (a*b) % n = (a%n * b%n) % n
	 * */
	
	static long moduloArith(long a, long b, int n) {
		long res=1;
		
		while(b > 0) {
			if((b&1) !=0) {
				res = (res % n * a % n) % n ;
			}
			a= (a % n * a % n) % n;
			b= b >>1;
		}
		return res;
	}
}
