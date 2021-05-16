package com.factory;

public class LaptopFactory {

	public Laptop getNewLaptop(String str) {
		
		if(str.equalsIgnoreCase("Mac"))
			return new AppleLaptop();
		else if (str.equalsIgnoreCase("Dell"))
			return new DellLaptop();
		else 
			return new HpLaptop();
	}
}
