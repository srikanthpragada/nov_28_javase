package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
 
class PrintName implements Consumer<String> {
	@Override
	public void accept(String arg) {
	    System.out.println(arg.toUpperCase());
	}
}

public class NamesStream {
	public static void main(String[] args) {
		 ArrayList<String> names = new ArrayList<>();
		 names.add("Bill Gates");
		 names.add("Steve Jobs");
		 names.add("Larry Ellison");
		 names.add("Larry Page");
		 names.add("Musk");
		 
		 		 
		 double avg  = names.stream()
				            .mapToInt( s -> s.length())
				            .average()
				            .getAsDouble();
	 
		 System.out.println(avg);
		 
		 names.stream().filter( s -> s.length() > avg).forEach(System.out::println);
		 
		 
		 // names.stream().forEach( new PrintName());  // Consumer
		 // names.stream().forEach(s -> System.out.println(s));  // Consumer
		 names.stream()
		      .filter(s -> s.length() > 5)
		      .sorted()
		      .forEach(System.out::println);  // Consumer
	}

}
