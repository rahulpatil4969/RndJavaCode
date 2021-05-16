package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {

	public static void main(String[] args) {


		List<Integer> alist = new ArrayList<>();
		
		alist.add(0);
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		alist.add(5);
		alist.add(6);
		alist.add(7);
		alist.add(8);
		
		Iterator<Integer> itr = alist.iterator();
		
		while(itr.hasNext()) {
			
			Integer num=(Integer)itr.next();
			
			if (num % 2 == 0) 
					System.out.print( " "+num);
			else
				itr.remove();
		}
		
		System.out.println();
		System.out.println(alist.size());
	}

}
