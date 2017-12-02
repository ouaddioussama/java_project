package com.tp1;

public class Main {

	static Personne p1 ;
	static Personne p2 ;

	
	static Personne changeRef(Personne p){
		
		//p=new Personne();
		p.setAge(12);
		System.out.println(p.getAge());
		
		return p;
		
	}
	

	
	
	
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("abc");
		System.out.println(sb1.substring(1, 2));
		 StringBuilder sb2 = sb1;
		 sb1.append("d");
		 System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
		String s1 = "abc";
		  String s2 = s1;
		  s1 += "d";
		  System.out.println(s1 + " " + s2 + " " + (s1==s2));
		byte[][] ba = {{1,2,3,4}, {1,2,3}};
		 System.out.println(ba[1].length + " " + ba.length);
		String s = new String("oussa");
		System.out.println(s.toUpperCase());
		s=s.toUpperCase();
		System.out.println(s);
		
		
		System.out.println("--------------------");
		Personne pp=new Personne(13);
		Personne p =changeRef(pp);
		System.out.println(p.getAge());
		
		
		System.out.println("-----------------------------------------");
		int[] tab_int = new int[6] ;
		int[] tab_2_int = {1,12,3};
		
		int[][] scores = {{5,2,4,7}, {9,2}, {3,4}};
		System.out.println(" int length :"+scores[1].length);
		
		System.out.println("--------------------------");
		System.out.println("tab 2 "+tab_2_int.length);
		System.out.println("tab 1 values "+scores[2][1]);
		
		
		System.out.println("tab length : "+tab_int.length);
		//p1= new Personne();  // p1 est une instanciation de la classe personne 
		p2= new Personne();
		
		p1= new Personne(12);
		System.out.println("age objet 1  : " +p1.getAge());
		p1.incrementation();
		//System.out.println("age objet 1 after incrementation : " +p1.getAge());
		p1.setAge(2);
		p1.setAge(10);

		//System.out.println("age objet 1 after set   :" +p1.getAge());

		//System.out.println("age objet 2   :" +p2.age);


	}

}
