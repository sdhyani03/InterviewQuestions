package arraysAndStrings;

import java.util.HashMap;
import java.util.Objects;

/**
 * 
 * @author Sachin
 * Question : Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 *
 */
public class IsUnique {

	public static boolean withAdditionalDataStructure(String word) {
		
		HashMap<Character,Integer> map=new HashMap<>();
		boolean duplicateEntryFound=false;
		
		for(Character ch:word.toCharArray()) {
			if(Objects.isNull(map.get(ch))) {
				map.put(ch, 1);
			}
			else {
				duplicateEntryFound=true;
				break;
			}
		}
		return !duplicateEntryFound;
	}

}
