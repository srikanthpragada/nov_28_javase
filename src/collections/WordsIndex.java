package collections;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

public class WordsIndex {
	public static void main(String[] args) throws Exception {
       TreeMap<String, LinkedHashSet<Integer>> index = new TreeMap<>();
       List<String> lines = Files.readAllLines
    		    (Paths.get("f:\\classroom\\wordsindex.txt"));
       
       int lineno = 1;
       for(String line : lines)
       {
    	   String words[] = line.split("[ ,;.]+");
    	   for(String word : words)
    	   {
    		   // if word is present in index then add lineno
    		   if (index.containsKey(word))
    		   {
    			   // get value and add lineno to the set 
    			   index.get(word).add(lineno);
    		   }
    		   else
    		   {
    			   LinkedHashSet<Integer> linenos =  new LinkedHashSet<>();
    			   linenos.add(lineno);
    			   index.put(word, linenos);
    		   }
    	   }
    	   lineno ++;
       }
       
       
       for(String word :  index.keySet()) {
    	   System.out.printf("%-20s",word);
    	   // print linenos
    	   for(Integer lno :  index.get(word)) 
    	   {
    		   System.out.print(lno + " ");
    	   }
    	   
    	   System.out.println();
       }
       
	}

}
