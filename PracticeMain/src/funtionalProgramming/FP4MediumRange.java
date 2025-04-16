package funtionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FP4MediumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<Integer> list = new ArrayList<>(List.of(2,4,4,12,43,534,654,2387,2738,42,5));
	    
	    //Given a list of integers, use the Stream API to compute the sum of the squares of the integers.
	    
	        int sumOfSqu = list.stream().map(e->e*e).reduce(0,(a,b)->a+b);
	        System.out.println(sumOfSqu);
	        
	        
	    // Given a list of integers, use the Stream API to find the maximum and minimum values in the list.
	        
	        int max = list.stream().reduce((a,b)->(a>b)?a:b).orElse(0);
	        int min = list.stream().reduce((a,b)->(a<b)?a:b).orElse(0);
	        max = list.stream().mapToInt(e->e).max().orElse(0); //This gives optional type
	        min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
	        System.out.println("Max - "+max+"\nMin - "+min);
	        
	        
	    //Given a list of strings, use the Stream API to group the strings by their length
	        List<String> sList = List.of("samba","sanjay","Kumari","srinu","Landa","Kasthuribhai");
	        
	        Map<Integer, List<String>> groupedByLength = sList.stream()
	                .collect(Collectors.groupingBy(String::length));
	        
	        groupedByLength.forEach((length, lis) -> {
	            System.out.println("Length " + length + ": " + lis);
	        });
	}

}
