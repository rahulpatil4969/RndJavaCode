package ExceptionHandling;

import java.sql.SQLException;

public class CustomeException {

	private static void tocheckForVoting(int age) throws InvalidAgeException {


		if(age<18) {
			throw new InvalidAgeException("Not Eligible For Voting...!");
		}
		else
			System.out.println("Welcome For Voting...!");
	}
	
	public static void main(String[] args) {
		try {
			tocheckForVoting(18);
		}catch(Exception e) {
			System.out.println(e);
		}

		System.out.println("Rest Code will be Execute..");
	}

	

}
