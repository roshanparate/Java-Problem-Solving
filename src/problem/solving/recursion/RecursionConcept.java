package problem.solving.recursion;

public class RecursionConcept {

	/*
	 * Step for recursion
	 * 
	 * 1. find the base case
	 * 2. find the relation between the problem and sub-problem
	 * 3. generalize the relation
	 * */
	public static void main(String[] args) {
		printHello(5);
	}

	private static void printHello(int v) {
		if(v == 0)
			return;
		
		System.out.println("Hello..");
		printHello(v-1);
	}

}
