package com.Collection;

public class Main {
	static Integer x =2;
	static int n;
	

	public static void main(String[] args) {
		n++;
		System.out.println(n);
//		System.out.println(x);
		switch (n) {
		default:
			System.out.println("dd");System.out.println((int)Math.random()*3);
			System.out.println(x*2);
			break;
			
		case 81:System.out.println("hh");
		
		case 13:
			System.out.println("bb");
		}
		
		/*
		String s = "";
		for (int y = 0; y < 3; y++) {
			x++;
			switch (x) {
			case 8:
				s += "8 ";
			case 9:
				s += "9 ";
			case 10: {
				s += "10 ";
				break;
			}
			default:
				s += "d ";
			case 13:
				s += "13 ";
			}

		}
		System.out.println(s);*/
	}

	
}