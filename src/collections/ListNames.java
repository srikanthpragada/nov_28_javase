package collections;

import java.util.TreeSet;

public class ListNames {

	public static void main(String[] args) {
		 TreeSet<String> names = new TreeSet<>();
		 names.add("Bill Gates");
		 names.add("Micheal Dell");
		 names.add("Larry Ellison");
		 names.add("Larry Page");
		 
		
		 
		 for(String name : names)
			 System.out.println(name);
		 
		 
		 System.out.println( names.contains("Larry Ellison"));
		 
		 
	}

}
