package problem.solving.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {

	static final int NO_OF_CHARS = 256;
	
	public static void main(String arg[]) {
		printDups("RoshanParate");
	}
	
	public static void printDups(String str) {
		
		int count[] = new int[NO_OF_CHARS];
		fillCharCounts(str, count);
		System.out.println("");

		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] > 1)
				System.out.println((char) (i) + ", count = " + count[i]);
		
		
	}
	
	static void fillCharCounts(String str, int[] count) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
		
		Arrays.stream(count).forEach(System.out::print);
	}
	
	
	/***************************Solution using HashMap*************************/
	static void printDupsUsingHashMap(String str)
    {
        HashMap<Character, Integer> count = new HashMap<>();
        /*Store duplicates present
        in the passed string */
        for (int i = 0; i < str.length(); i++) {
            if (!count.containsKey(str.charAt(i)))
                count.put(str.charAt(i), 1);
            else
                count.put(str.charAt(i),
                          count.get(str.charAt(i)) + 1);
        }
 
        /*Print duplicates in sorted order*/
        for (Map.Entry mapElement : count.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
 
            if (value > 1)
                System.out.println(key
                                   + ", count = " + value);
        }
    }

}
