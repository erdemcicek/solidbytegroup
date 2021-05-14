package week01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 	Write a program that prompts the user to enter values, obtain their average, 
 	and displays the number of values greater than the average.
 */

public class Tuesday_Lambda_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of items");
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the numbers");
		IntStream.range(0, n).forEach(t->list.add(scan.nextInt()));
		
		double avg = list.stream().mapToDouble(a->a).average().getAsDouble();
		System.out.println(avg);
		
		long count = list.stream().filter(t->t>avg).count();
		System.out.println(count);
		list.stream().filter(t->t>avg).forEach(System.out::println);

		scan.close();
	}
}
