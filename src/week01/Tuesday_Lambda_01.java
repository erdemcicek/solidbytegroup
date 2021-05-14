package week01;

import java.util.List;
import java.util.stream.Collectors;

/*
 	Given a list of strings, write a method that returns a list of all strings that 
 	start with the letter 'a' (lower case) and have exactly 3 letters.

 */

public class Tuesday_Lambda_01 {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("abc", "aim", "add", "abcd", "klmn", "iyi");
		System.out.println(separateStr(list));
		
	}
	public static List<String> separateStr(List<String> slist){
		
		return slist.stream().filter(t->t.startsWith("a") && t.length()==3).collect(Collectors.toList());
	}

}
























// return slist.stream().filter(t->t.startsWith("a") && t.length() == 3).collect(Collectors.toList());