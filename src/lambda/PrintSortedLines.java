package lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintSortedLines {

	public static void main(String[] args) throws Exception  {

		 Path file = Paths.get("f:\\classroom\\names.txt");
		 Files.readAllLines(file)
		      .stream()
		      .distinct()
		      .sorted()
		      .forEach(System.out::println);


	}

}
