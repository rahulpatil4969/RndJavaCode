package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomeSortWithComparable {

	public static void main(String[] args) {


		List<Employee> al = new ArrayList<>();
		
		al.add(new Employee(14,"Ram"));
		al.add(new Employee(12,"Akshay"));
		al.add(new Employee(11,"Mayur"));
		al.add(new Employee(13,"Akash"));
		

		Collections.sort(al);
		
		for(Employee em:al) {
			System.out.println(em);
		}
	}

}

