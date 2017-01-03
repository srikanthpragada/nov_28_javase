package lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFolders {
	public static void main(String[] args) throws Exception {
		Path dir = Paths.get("f:\\classroom\\nov28");
		
		long sum = Files.walk(dir)
	     .filter( p -> p.toFile().isFile())
	     .mapToLong( p -> p.toFile().length())
	     .sum();

		System.out.println(sum / (1024 * 1024));
		
//				
//		Files.walk(dir)
//		     .filter( p -> p.toFile().isDirectory())
//		     .forEach(System.out::println);
    
	}
	
}
