package com.tp1;

class Mixer {
	 Mixer() { }
	 Mixer(Mixer m) { m1 = m; }
	 Mixer m1;
	 int  h=12;
	 static int k =3;
	 public static void main(String[] args) {
		 
		  boolean b = false;
		  if (b = true) { System.out.println("b is true");
		  } else { System.out.println("b is false"); }
		 
		 if(2==2)
		 
		 System.out.println(2*(3+1));
		 System.out.println("char 'a' == 'a'? " + ('a' == 'a'));
		 System.out.println("char 'a' == 'b'? " + ('a' == 'b'));
		 System.out.println("5 != 6? " + (5 != 6));
		 System.out.println("5.0 == 5L? " + (5.0 == 5L));
		 System.out.println("true == false? " + (true == false));

	 Mixer m2 = new Mixer();
	 m2.go(2);
	 System.out.println(m2.k);
	 System.out.println(m2.h);
	 Mixer g = call(m2);
	 System.out.println("compare obj :"+(m2==g)+m2.h+" compare h :"+(m2.h==g.h));
	 /*
	 System.out.println(m2.m1);
	 Mixer m3 = new Mixer(m2); m3.go();
	 Mixer m4 = m3.m1; m4.go();
	 Mixer m5 = m2.m1; 
	 m5.go();
	 System.out.println(m2.h); */
	 }
	 void go(int b) { System.out.print("hi "); k++;
	}
	 
	static Mixer call(Mixer x){
		 final Mixer z = x;
		 z.h=10;
		 return z;
	 }
	}