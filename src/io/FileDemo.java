package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		File f = new File("f:\\classroom\\nov28\\Hello.java");
		f.delete();
		System.out.println("Deleted");
		
	  /*
		File f = new File("f:\\classroom\\nov28");
		
		if ( f.exists())
		{
			if ( f.isFile())
			    System.out.println("File");
			else
			{
				for(File file : f.listFiles()) 
				{
					System.out.println(file.toString());
				}
			}
		}
		else
			System.out.println("Not Present");
			
			*/

	}

}
