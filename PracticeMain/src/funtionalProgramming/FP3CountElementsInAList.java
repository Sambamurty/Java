package funtionalProgramming;

import java.util.ArrayList;
import java.util.List;

//Given a list of elements, use the Stream API to count the number of elements in the list.

public class FP3CountElementsInAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(List.of(2,4,4,12,43,534,654,2387,2738,42,5));
		int count = (int)list.stream().count();
		
		int countp = (int)list.stream().map(e->1).reduce(0,(a,b)->a+b);
								//Map each element to the value 1 (representing one element)
		System.out.println(count+"  "+countp);
	}

}
