package com.ConventionName;

public class Main {
	
	
	static int  j;

	public static void main(String[] args) {
		

		System.out.println(Convention.MAX_HEIGTH);
		j = Convention.getMaxConstant();
		System.out.println(j);
		
		ConventInterf c = new ConventionImp();
		c.display();
		//Convention.getMaxConstant()
		
	}

}
