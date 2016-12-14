import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		/* Calendar c = Calendar.getInstance();
		 c.add( Calendar.DAY_OF_MONTH,10);
		 System.out.println( c.get(Calendar.MONTH));*/
		 
		 Date d = new Date();
		 System.out.println(d);
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 System.out.println( sdf.format(d));
		 
		 
		 

	}

}
