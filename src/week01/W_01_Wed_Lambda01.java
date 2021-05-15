package week01;

import java.util.Arrays;

public class W_01_Wed_Lambda01 {
	
	public static void main(String[] args) {
		
		String[] names = { "John", "Peter", "Susan","George", "Alan", "Michelle", "Steve", "Stacy", "Kim", "Jen", "john", "susan"};
		
		// i. Find if all names starts with a capital letter. (Print true or false accordingly)
		boolean isAllUpper = Arrays.stream(names).allMatch(t->Character.isUpperCase(t.charAt(0)));
		System.out.println(isAllUpper);
		
		// ii.Sort the names in reverse order ( without case-sensitivity)
		// 1.Way
		Arrays.stream(names).sorted((x,y)->-x.compareToIgnoreCase(y)).forEach(System.out::println);
		
		// 2.Way
		Arrays.stream(names).sorted((x,y)->y.compareToIgnoreCase(x)).forEach(System.out::println);
	
	}
}
