package com.heritage;

public class GameShape {
	
	String name="kira";
	
	GameShape(){
		System.out.println("here is GameShape");
	}
	
	GameShape(String name){
		//this();
		System.out.println("this a GameShape contructor  parameter");
	}
	
	
	 int k =12;

	public void displayShape() {
		System.out.println("displaying shape");
	}
	
	 void makeNoise() {System.out.println("generic noise"); }


}
