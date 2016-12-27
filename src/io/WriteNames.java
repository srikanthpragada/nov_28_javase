package io;
import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("f:\\classroom\\nov28\\names.txt")) 
		{
			fw.write("James Gosling\n");
			fw.write("Gavin King\n");
			fw.write("Rod Jhonson\n");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
