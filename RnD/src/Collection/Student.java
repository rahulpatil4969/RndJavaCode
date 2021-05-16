package Collection;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	
	 int rollno;
	 private String name;
	 private int age;
	 
	 Student(int rollno,String name,int age){
		 this.rollno = rollno;
		 this.name = name;
		 this.age = age;
	 }

	public int compareTo(Student st) {
		if(rollno == st.rollno)
			return 0;
		else if (rollno > st.rollno)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

}