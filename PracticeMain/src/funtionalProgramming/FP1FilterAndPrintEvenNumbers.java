package funtionalProgramming;

import java.util.List;

//Given a list of integers, use the Stream API to filter out and print only the even numbers.

public class FP1FilterAndPrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1,4,4,54,567,8673,53,75,86,54,3);
		list.stream().filter(i->i%2==0).forEach(System.out::println);
	}

}
