package Singaltone;

public class SingaltoneDemo {
	
	static  SingaltoneDemo sdemo=null;
	
	private SingaltoneDemo() {
		System.out.println("Obj Created..!");
		System.out.println(sdemo);
	}
	
	public static SingaltoneDemo getObj() {
		if(sdemo==null) 
			return new SingaltoneDemo();
		else
			return sdemo;
	}

	public static void main(String[] args) {
		SingaltoneDemo.getObj();
		SingaltoneDemo.getObj();
		
		SingaltoneDemo s1 = SingaltoneDemo.getObj();
		SingaltoneDemo s2 = SingaltoneDemo.getObj();
	}

}
