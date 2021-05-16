package Collection;

public class Employee implements Comparable<Employee>{
	
		int rollno;
		String name;
		
		
		public Employee(int rollno, String name) {
			super();
			this.rollno = rollno;
			this.name = name;
		}
		

		@Override
		public String toString() {
			return "Employee [rollno=" + rollno + ", name=" + name + "]";
		}


		@Override
		public int compareTo(Employee arg0) {
			
			return this.rollno-arg0.rollno;
		}
		
		
	
}
