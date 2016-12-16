
public class TestTime {

	public static void main(String[] args) {
	   
		Time t1 = new Time(10,20,30);
		Time t2 = new Time(10,20,50);
		
		int result = t1.compareTo(t2);
		
	    if ( result  == 0 )
	    	System.out.println("Equal");
	    else
	    	if ( result > 0)
	    		System.out.println("t1 > t2");
	    	else
	    		System.out.println("t1 < t2");
	    	
			
	}

}
