package com.heritage;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		System.out.println("sb = " + sb); // output is "sb = abcdef
		String x = "taxi";
		System.out.println( x.concat(" cab") ); // output is "taxi cab"
		System.out.println(""+1+2+"");
		int sizeOfYard = 1;
		 int numOfPets = 13;
		 String status = (numOfPets<4)?"Pet count OK"
		 :(sizeOfYard > 8)? "Pet limit on the edge"
		 :"too many pets";
		 System.out.println("Pet status is " + status);
		 if(false&&true)
			 System.out.println("truuue");
		 
		System.out.println("------------------------------------------------");
		
		int testMe=5;
		String here = (testMe<6)?"yes it is good":"it is not good";
		int haha=(testMe==5)?10:4;
		System.out.println("haha ="+haha);
		System.out.println("here = "+here);
		
		System.out.println("------------------------------------------------");
		Animal n = new Dog();
		Dog b = new Dog();
		
		Dog bo = (Dog)n;
		
		if(bo instanceof Dog)		
		System.out.println(" yes instance of dog");
		
		int k = 1_000;
		System.out.println(k);
		String b1 = "101010";
		System.out.println(Integer.parseInt(b1,2));
		int nine = 011; // Equal to decimal 9
		int b2 = 0b00011; 
		float y = 12.3F;
		long so = 0xFFFFl; 
		char bb = 982; 
		char letterN = '\u004E'; // The letter 'N';
		 System.out.println("Octal 010 = " + nine+ " "+b2+" hexa :"+so+" f :"+y+" letter unicode :"+"\""+Character.getNumericValue(bb));
		
		//GameShape gm = new GameShape();
		//GameShape gm1 = new GameShape("sama");

	
		PlayerPiece p = new PlayerPiece("sama");
		p.k=8;
		System.out.println(p.name);
		GameShape gm= new PlayerPiece();
		System.out.println(gm.name);
		gm.makeNoise();
		//System.out.println(p.k);
		//System.out.println(gm.k);
		
		 //Animal animale = new Animal();
          //animale.makeNoise();
          
          //Dog dog = new Dog();
          //dog.makeNoise();
		
		//Dog dd = (Dog) animale;
		//dd.makeNoise();
		/*

		PlayerPiece p = new PlayerPiece();
		p.displayShape();
		p.movePiece();
		
		
		GameShape gs= new PlayerPiece();
		doStuff(gs);  */
		//doStuff(gs);
		
		
		// Animal [] a = {new Animal(), new Dog(), new Animal() };
	/*	 for(Animal animal : a) {
		 //animal.makeNoise();
		 if(animal instanceof Dog) {
			 System.out.println("hoo");
		// animal.playDead(); // try to do a Dog behavior?
		 Dog d = (Dog) animal; // casting the ref. var.
		 d.playDead();
		 }
		 }   */
		
	}
	
	public static void doStuff(GameShape a) {
		 System.out.println("In the gameshape version");
		 }
	
	
	public static  void doStuff(PlayerPiece a) {
		 System.out.println("In the PlayerPiece version");
		 }
	

}
