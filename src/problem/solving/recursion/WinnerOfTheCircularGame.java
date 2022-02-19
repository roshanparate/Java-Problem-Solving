package problem.solving.recursion;

public class WinnerOfTheCircularGame {

	//Josephus Problem
	public static void main(String[] args) {
		
		System.out.println(findTheWinner(5,2));
		
	}
	
	//f(n,k) = (f(n-1,k) + k-1) % n+1
	public static int findTheWinner(int n, int k) {
        if(n==1){
            return 1;
        }
        return ((findTheWinner(n-1, k) + k-1) % n+1);
    }
}
