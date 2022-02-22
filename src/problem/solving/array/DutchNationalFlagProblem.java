package problem.solving.array;

public class DutchNationalFlagProblem {

	public static void main(String[] args) {
		int array[] = {2,1,0,1,0,2,1,0};
		int[] array1 = sortColors(array);
		for(int i : array1) {
			System.out.println(i);
		}

	}
	
	public static int[] sortColors(int[] nums) {
        int i =0;
        int j=0;
        int k = nums.length-1;
        
        int mid = 1;
        
        while( j <= k ) {
            if(nums[j] > mid){
                 int temp= nums[k];
                 nums[k]= nums[j];
                 nums[j]= temp;
                 k--;
            }else if(nums[j] < mid){
                 int temp= nums[i];
                 nums[i]= nums[j];
                 nums[j]= temp;
                 i++;
                 j++;
            }else{
                j++;
            }
        }
        
        return nums;
    }
	
}
