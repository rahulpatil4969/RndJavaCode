package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortByValue {

	public static void main(String[] args) {


		Map<Integer,String> hm= new HashMap<>();
		
		hm.put(10,"Rahul");
		hm.put(20,"Abhay");
		hm.put(30,"Ram");
		hm.put(40,"Baban");
		hm.put(50,"Madhu");
		
		System.out.println(hm);
		
		Set s=hm.entrySet();
		
		List<Entry<Integer,String>> ls=new ArrayList<>(s);
		
		Collections.sort(ls,new Comparator<Map.Entry<Integer,String>>(){

			@Override
			public int compare(Entry<Integer, String> arg0, Entry<Integer, String> arg1) {
				// TODO Auto-generated method stub
				return (arg0.getValue().compareTo(arg1.getValue()));
			}
		});
		
		for(Map.Entry<Integer, String> mp:ls) {
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
	}

}
