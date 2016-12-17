import java.util.Arrays;

public class SortTimes {

	public static void main(String[] args) {
		Time[] times =
				{ new Time(10, 20, 30), 
			   	  new Time(20, 20, 20), 
			   	  new Time(2, 2, 2) };
		
		Arrays.sort(times);
		
		for(Time t : times)
			System.out.println(t);
	}
	

}
