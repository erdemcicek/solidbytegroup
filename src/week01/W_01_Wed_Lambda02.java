package week01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
  	Q_2 ) String text = "Good morning. Have a good class. Have a good visit. Have fun!";
 	
 		  Write a program that counts the occurrences of words in the String ( without case-sensitivity )
 		  
 		  Collectors.groupingBy( classifier , supplier , processor )
 		  
 		  --> classifier : criteria for grouping
 		  --> supplier   : new keyword generally
 		  --> processor  : how the elements in a group are processed
 		   
 */

public class W_01_Wed_Lambda02 {
	
	public static void main(String[] args) {
		
		String text = "Good morning. Have a good class. Have a good visit. Have fun!";
		
		// 1.Way : supplier is inside "groupingBy" as second parameter
		Arrays.stream(text.replaceAll("\\W", " ").split(" ")).filter(t->t.length()>0)
		.collect(Collectors.groupingBy( String::toLowerCase, ()->new HashMap<>()  , Collectors.counting()))
		.forEach( (x,y) -> System.out.printf("%-10s%2s\n", x,y));
		
		// 2.Way : defining an external map as supplier, then printing the map
		Map<String, Long> hm1 = Arrays.stream(text.replaceAll("\\W", " ").split(" ")).filter(t->t.length()>0)
				.collect(Collectors.groupingBy( t->t.toLowerCase(), Collectors.counting()));
		System.out.println(hm1);
		
		// Another example: defining an external map as supplier, but this time using lengths as classifier
		Map<Integer, Long> hm2 = Arrays.stream(text.replaceAll("\\W", " ").split(" ")).filter(t->t.length()>0).map(t->t.toLowerCase())
				.collect(Collectors.groupingBy( t->t.length(), Collectors.counting()));
		System.out.println(hm2);
	
	}
	
}
