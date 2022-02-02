package com.adactin.pom;

public class PojoB {
	
	public static void main(String[] args) {
		Pojo pc = new Pojo();
		
		pc.setI(20);
		int value = pc.getI();
		System.out.println(value);
		
	}

}
