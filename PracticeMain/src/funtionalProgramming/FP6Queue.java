package funtionalProgramming;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FP6Queue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		//Inserting values into queue.
		Stream.of("samba","murty","landa","sanjay","landa").forEach(e-> q.offer(e));
		
		//List of distinct values that ends with "a"
		Predicate<String> endsWithA = s->s.endsWith("a");	
		q.stream().distinct().filter(endsWithA).forEach(System.out::println);
	}

}
