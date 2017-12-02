package com.ConventionName;

public  class Convention {
	
	public static final int MAX_HEIGTH=12;
	
	protected  int j ;
	int[] key;
	
	 CoffeeSize size;
	 
	 public enum Days { MON, TUE, WED };

	
	 public  static int getMaxConstant(){
		
		return MAX_HEIGTH;
	}

	public static void main(String[] args) {
		Days [] d2 = Days.values();
		 System.out.println(d2[2]);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(42));
		
		Convention h = new Convention();
		 System.out.println(CoffeeSize.BIG.getOunces());
		new Convention().getkira();
		//int k = getMaxConstant();
		
		//System.out.println(k);

	}
	
	protected    void getkira(){
		System.out.println("this is kira");
		final int k ;
		k=10;
		System.out.println(k);
		
	}
	

}
