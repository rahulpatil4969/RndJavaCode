package StringRelated;

public class FindBigString {

	private static void toFindBigStr(String string) {

		String temp;
		String[] str=string.split(" ");
		
		for(int i=0; i<str.length; i++) {
			for(int j=i+1; j<str.length; j++) {
				if(str[i].length() > str[j].length()) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		System.out.println(str[str.length-1]);
	}
	
	public static void main(String[] args) {


		toFindBigStr("I am good Fullstack devloper ");
	}

}
