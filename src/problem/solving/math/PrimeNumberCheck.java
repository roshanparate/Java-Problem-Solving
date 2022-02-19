package problem.solving.math;

import java.util.Arrays;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		boolean[] isPrime = seiveOfEratoSthenes(20);
		
		for(int i=0; i< isPrime.length; i++) {
			System.out.println(i +" "+ isPrime[i]);
		}
	}
	
	static boolean[] seiveOfEratoSthenes(int num) {
		
		boolean isPrime[] = new boolean[num+1];
		
		Arrays.fill(isPrime, true);
		
		isPrime[0]= false;
		isPrime[1]= false;
		
		for(int i=2; i*i <=num; i++ ) {			
			for(int j= 2*i; j<=num; j += i) {
				
				isPrime[j]= false;
			}
		}
		return isPrime;
	}
}

// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
// F F     F   F   F F  F     F     F  F   F   F  F  F    