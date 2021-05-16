package Lambda;

public class LambdaEx1 {

	public static void main(String[] args) {
		
		Int_sum add =(x,y) -> x+y;
		
		System.out.println(add.sum(10, 30));

	}

}
