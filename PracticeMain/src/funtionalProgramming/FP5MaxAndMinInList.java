package funtionalProgramming;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FP5MaxAndMinInList {
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.addAll(List.of(1,23,432,53,53,234));
		
		//Operations on list.
		int max = list.stream().reduce(Integer.MIN_VALUE, (a,b) -> a<b ? b:a);
		System.out.println(max);
		
		//To find element present in list
		int ele = 5;
		boolean b=list.stream().anyMatch(e-> e==ele);
		System.out.println(b);
		
		//To get index and the element in the list if present
		IntStream.range(0,list.size())
			.filter(i -> list.get(i)==ele)
			.findFirst()
			.ifPresentOrElse(i -> System.out.println(list.get(i)+" "+i), ()->System.out.println("There is no element in the list"));
		
		//Removing Duplicates From list
		List<Integer> listWithNoDuplicates = 
					list.stream().distinct().collect(Collectors.toList());
		System.out.println(listWithNoDuplicates);
	}
}
