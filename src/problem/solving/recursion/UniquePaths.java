package problem.solving.recursion;

public class UniquePaths {

	public static void main(String[] args) {
		
		System.out.println(uniquePaths(51,9));
	}
	
	public static int uniquePaths(int m, int n) {
        int[][] myCache = new int[m + 1][n + 1];
        return fib(m, n, myCache);
    }
    
	public  static int fib(int m, int n, int[][] myCache) {
        if (m == 1 || n == 1) return 1;
        
        if (myCache[m][n] == 0) 
        	myCache[m][n] = fib(m - 1, n, myCache) + fib(m, n - 1, myCache);
        
        return myCache[m][n];
        
    }
}
