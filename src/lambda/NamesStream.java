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
		 
		 // names.stream().forEach( new PrintName());  // Consumer
		 // names.stream().forEach(s -> System.out.println(s));  // Consumer
		 names.stream().forEach(System.out::println);  // Consumer
	}

}
