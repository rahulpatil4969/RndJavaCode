package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Student st1 =(Student)arg0;
		Student st2 =(Student)arg1;
		
		if(st1.rollno==st2.rollno)
			return 0;
		else if (st1.rollno > st2.rollno)
			return 1;
		else 
			return -1;
	}

}
