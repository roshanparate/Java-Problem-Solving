package problem.solving.array;

public class TrappingRainWaterProblem {

	public static void main(String[] args) {
		int array[] = {1,0,2,1,3,1,2,0,3};
		System.out.println(trap(array));
	}
	
	public static int trap(int[] height) {
		int maxLeft[]  = new int[height.length];
	     int maxRight[] = new int[height.length];
	        
	        int maxl=0;
	        maxLeft[0] = 0;
	        for(int i =1; i<height.length; i++){
	            maxl = Math.max(maxl,height[i-1]);
	            maxLeft[i] = maxl;
	        }
	        
	        int maxR=0;
	        maxLeft[height.length-1] = 0;
	        for(int i = height.length-2; i>=0; i--){
	            maxR = Math.max(maxR,height[i+1]);
	            maxRight[i] = maxR;
	        }
	        
	        int trapSum = 0;
	        for(int i=0; i<height.length; i++){
	            int cal = Math.min(maxLeft[i],maxRight[i])-height[i];
	           trapSum += (cal>0) ? cal : 0;
	        }
	        
	        return trapSum;
	    }
	
}
