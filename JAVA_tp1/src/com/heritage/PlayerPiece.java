package com.heritage;

public class PlayerPiece  extends GameShape{
	
	String name="kiraa";
	
	PlayerPiece(){
		System.out.println("here is playerpiece");
	}
	
	PlayerPiece(String name){
		this();
		System.out.println("this a PlayerPiece contructor parameter");
	}

	public void movePiece() {
		System.out.println("moving game piece");
	}
	
	 void makeNoise() {System.out.println("bark"); }
	 void playDead() { System.out.println("roll over"); }

}
