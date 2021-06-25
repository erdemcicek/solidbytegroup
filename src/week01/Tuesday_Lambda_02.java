package week01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 	Write a method that returns a comma-separated string based on a given list of integers. 
 	Each element should be preceded by the letter 'e' if the number is even, 
 	and preceded by the letter 'o' if the number is odd. 
 	For example, if the input list is (3,44,46,57), the output should be 'o3,e44,e46,o57'.
 	
 	1.Way -> reduce
 	2.Way -> collect + StringBuilder
 	3.Way -> collect + joining
 */

public class Tuesday_Lambda_02 {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(3,44,46,57);
///		System.out.println(commaSep(list));
//		System.out.println(commaS(list));
		List<Integer> l2 = new ArrayList<>();
		l2.addAll(list);
		System.out.println(l2);
	}
	
	private static String commaSep(List<Integer> list) {
		
//		return list.stream().map(t-> t%2==0 ? "e"+t : "o" + t).reduce("",(x,y)->x+","+y).substring(1);
//		return list.stream().map(t-> t%2==0 ? "e"+t : "o" + t)
//				.collect( ()->new StringBuilder() , (c,e)-> c.append(","+ e)  ).toString();
		//						supplier          ,        accumulator       ,    combiner
//		return list.stream().map(t-> t%2==0 ? ",e"+t : ",o" + t)
//				.collect( StringBuilder::new, StringBuilder::append, StringBuilder::append).toString().substring(1);
		return list.stream().map(t-> t%2==0 ? "e"+t : "o" + t).collect(Collectors.joining(","));		
	}
	
	private static List<String> commaS(List<Integer> list){
		
//		return list.stream().map(t-> t%2==0 ? "e"+t : "o" + t).collect( ArrayList::new, ArrayList::add, ArrayList::addAll);
//		return list.stream().map(t-> t%2==0 ? "e"+t : "o" + t).collect(Collectors.toList());
		
		return list.stream().map( t-> t%2==0 ? "e"+t : "o" + t)
				.collect( () -> new ArrayList<>(), (c,e)-> c.add(e) , (x,y)-> x.addAll(y));	
	}
}
