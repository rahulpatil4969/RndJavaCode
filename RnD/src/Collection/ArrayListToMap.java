package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListToMap {

	public static void main(String[] args) {


		List<String> al = new ArrayList<>();
		al.add("A+5");
		al.add("B+3");
		al.add("C+8");
		al.add("B+5");
		al.add("E+9");
		al.add("C+20");
		
		Map<String,Integer> hm = new HashMap<>();
		
		for(String a:al) {
			
			String str =a.substring(0,a.indexOf("+"));
			String strnum = a.substring(a.indexOf("+"), a.length());
			int num = Integer.parseInt(strnum);
			
			
			if (hm.containsKey(str)) {
				hm.put(str,hm.get(str)+num);
			}
			else
				hm.put(str, num);
				
		}
		
		for(Map.Entry<String,Integer> hm1:hm.entrySet()) {
			System.out.println(hm1.getKey()+"  "+hm1.getValue());
			
		}
	}

}
