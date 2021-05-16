package BasicPrograms;

public class Armstrong {

	public static void main(String[] args) {
		findArmstrong(153);

	}

	private static void findArmstrong(int num) {

		int temp =num;
		
		int sum =0;
		
		while(num > 0) {
			int a = num % 10;
			
			sum +=sum + (a*a*a);
			
			num = num / 10;
		}
		
		if(temp==sum) 
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
}
