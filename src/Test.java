
public class Test {

	public static void main(String[] args) {
	   int num = 10;
	   
       fun(num); // auto-boxing
	   fun(10.50);
		   
	}

	public static void fun(Object obj) {
		if (obj instanceof Integer) {
		    int num =  (Integer) obj;
		    System.out.println( num + 1);
		}
		else
		{
			double num =  (Double) obj;
			System.out.println(num + 0.1);
		}
	}
}
