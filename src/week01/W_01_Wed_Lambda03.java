package week01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 	   		Write a program that prompts the user to enter numbers. 
 			Put them in a list. Then prints each integer with their occurrences.
 			
 			classifier, supplier , processor
 */

public class W_01_Wed_Lambda03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of values");
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the numbers");
		
		IntStream.range(0, n).forEach(t->list.add(scan.nextInt()));// 2, 2, 3, 5, 3
		//1.Way
		list.stream().collect(Collectors.groupingBy(t->t, Collectors.counting()))
		.forEach( (x,y) -> System.out.println(x + " occurs " + (y>1? y +" times" : y + " time")));
		// 2.Way
		Map<Integer, Long> map2 = list.stream().collect(Collectors.groupingBy(t->t, Collectors.counting()));
		System.out.println(map2);
	
		scan.close();
		
	}
}
