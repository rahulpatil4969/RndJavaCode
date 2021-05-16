package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CustomHashMapSortByValue {

		public static void main(String[] args) {


			Map<Integer,Customer> hm= new HashMap<>();
			

			hm.put(10,new Customer(101,"EIPL"));
			hm.put(20,new Customer(102,"IVPL"));
			hm.put(30,new Customer(103,"ABCD"));
			hm.put(40,new Customer(104,"PQRS"));
			

			
			System.out.println(hm);
			
			Set s=hm.entrySet();
			
			List<Entry<Integer,Customer>> ls=new ArrayList<>(s);
			
			Collections.sort(ls,new Comparator<Map.Entry<Integer,Customer>>(){

				@Override
				public int compare(Entry<Integer, Customer> arg0, Entry<Integer, Customer> arg1) {
					// TODO Auto-generated method stub
					return (arg0.getValue().getCustname().compareTo(arg1.getValue().getCustname()));
				}
			});
			
			for(Map.Entry<Integer, Customer> mp:ls) {
				System.out.println(mp.getKey()+" "+mp.getValue().getCustname());
			}
		}

}


