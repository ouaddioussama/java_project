package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class Cities {

	public static void main(String[] args) {

		 List<String> c = new ArrayList<String>(); // create an ArrayList, c
		 c.add("Oslo"); // add original cities
		 c.add("Paris");
		 c.add("Paris");
		 c.add("Rome");
		 System.out.println(c.size());
		 System.out.println(c.get(1));
		 System.out.println(c.contains("Paris"));
		 c.remove(0);
		 System.out.println(c);
		 //c.clear();
		// c.add(1, "hoho");
		 int index = c.indexOf("Rome"); // find Paris' index
		 System.out.println(c + " " + index);
		 c.add(index, "London"); // add London before Paris
		 System.out.println(c); // show the contents of c
		 System.out.println(c.toString());
		 System.out.println("finished");
		 System.out.println("end");
		
	}

}
