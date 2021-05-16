package com.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		LaptopFactory lpfact = new LaptopFactory();
		
		Laptop lapy =lpfact.getNewLaptop("dell");
		
		lapy.getLaptop();

	}

}
