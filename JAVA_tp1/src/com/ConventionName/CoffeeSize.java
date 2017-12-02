package com.ConventionName;

public enum CoffeeSize {
	
	 BIG(8), HUGE(10), OVERWHELMING(16);

	CoffeeSize(int ounces) { // constructor
		 this.ounces = ounces;
		 }
	 private int ounces; // an instance variable
	 
	 public int getOunces() {
	 return ounces;
	 }

}
