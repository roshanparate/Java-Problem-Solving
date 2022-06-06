package problem.solving.array;

public class MaximumSubArrayKadanesAlgo {

	public static void main(String[] args) {
		
		int num[] = {-5,4,6,-3,4,-1};
		System.out.println(maxSubArray(num));
	}
	
	public static int maxSubArray(int[] num) {
		
		int max_so = Integer.MIN_VALUE;
		int max_ending = 0;
		
		for(int i=0; i<num.length;i++) {
			max_ending = max_ending + num[i];
			if(max_ending > max_so) {
				max_so = max_ending;
			}
			
			if(max_ending < 0) max_ending=0;
			
		}
		
		return max_so;
	}

}
