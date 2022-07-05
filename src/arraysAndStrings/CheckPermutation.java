package arraysAndStrings;

import java.util.HashMap;
import java.util.Objects;

public class CheckPermutation {

	public static boolean checkPermutation(String s1,String s2) {
		
		if(s1.length()!=s2.length()) return false;
		
		HashMap<Character,Integer> str1=new HashMap<>();
		HashMap<Character,Integer> str2=new HashMap<>();
		
		fillHashMapValues(s1,str1);
		fillHashMapValues(s2,str2);
		
		for(Character ch:str1.keySet()) {
			
			if(str1.get(ch)!=str2.get(ch)) return false;
		}
		
		return true;
		
	}

	private static void fillHashMapValues(String s1, HashMap<Character, Integer> str1) {

		for(char ch:s1.toCharArray()) {
			if(Objects.isNull(str1.get(ch))) {
				str1.put(ch, 1);
			}
			else {
				str1.put(ch,str1.get(ch)+1);
			}				
		}	
	}


}
