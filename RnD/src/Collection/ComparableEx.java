package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

	public static void main(String[] args) {


		List<Student> al = new ArrayList<>();
		al.add(new Student(123,"Rahul",30));
		al.add(new Student(111,"Ram",30));
		al.add(new Student(122,"Rony",30));
		
		//Collections.sort(al);

		System.out.println(al);
	}

}