package Collection;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWithCount {

	private static void getDuplicateWithCount(String str) {
		
		char[] ch =str.toCharArray();

		Map<Character,Integer> hm = new HashMap<>();
		
		for(char c:ch) {
			
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> map:hm.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		getDuplicateWithCount("TamuliSonaRahulPatil");

	}

}
