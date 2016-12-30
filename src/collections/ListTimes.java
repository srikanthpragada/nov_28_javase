package collections;

import java.util.TreeSet;

public class ListTimes {

	public static void main(String[] args) {
		 TreeSet<Time> times = new TreeSet<>();
		 
		 times.add( new Time(10,20,30));
		 times.add( new Time(1,2,3));
		 times.add( new Time(10,20,30));
		 times.add( new Time(20,20,20));
		 times.add( new Time(10,10,10));
		 
		 		 
		 for(Time t : times)
			 System.out.println(t);
		 
		 
		 
	}

}
