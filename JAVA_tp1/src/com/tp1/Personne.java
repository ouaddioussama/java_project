package com.tp1;

public class Personne {

	public int age;
	// visibily ( public , private , protected , )

	public Personne() {
		
		System.out.println("this is my first object personne !");
		

	}

	// constructeur
	public Personne(int age1) {

		this.age = age1;

	}

	// fonction incrementation
	public int incrementation() {

		//this.age = this.age++;
		this.age=this.age +1;
		return this.age;
	}
	
	
	public int getAge(){
		return this.age;
	}
	
	
	public void setAge(int age2){
		this.age=age2;
		
	}

}
