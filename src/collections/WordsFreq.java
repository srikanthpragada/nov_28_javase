package collections;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

public class WordsFreq {
	public static void main(String[] args) throws Exception {
       TreeMap<String,Integer> index = new TreeMap<>();
       List<String> lines = Files.readAllLines
    		    (Paths.get("f:\\classroom\\wordsindex.txt"));
       for(String line : lines)
       {
    	   String words[] = line.split("[ ,;.]+");
    	   for(String word : words)
    	   {
    		   // if word is present in index then add lineno
    		   if (index.containsKey(word))
    		   {
    			   // get value and increment count  
    			   Integer count = index.get(word);
    			   index.put(word,count + 1);
    		   }
    		   else
    		   {
    			   index.put(word, 1);
    		   }
    	   }
       }
       
       
       for(String word :  index.keySet()) {
    	   System.out.printf("%-20s %d\n",word, index.get(word));
       }
       
	}

}
