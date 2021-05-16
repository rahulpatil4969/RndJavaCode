package StringRelated;

public class ReversString {

	public static void main(String[] args) {
		
		String str="Hello Rahul";
		
		ReversString.reverseWithOutStringBuilder(str);
		System.out.println(ReversString.reverseMannualy(str));
		System.out.println(ReversString.reverseWithStringBuilder(str));

	}

	//Approch 1
	
	private static void reverseWithOutStringBuilder(String str) {
		
		for(int i=str.length()-1; i>=0; i--) {
			
			System.out.print(str.charAt(i));
		}
	System.out.println();
	} 

	//Approch 2
	
	private static String reverseMannualy(String str) {
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i-- ) {
			
			 sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}

	//Approch 3
	
	private static String reverseWithStringBuilder(String str) {

		return new StringBuilder(str)
				.reverse()
				.toString();
	}

}
