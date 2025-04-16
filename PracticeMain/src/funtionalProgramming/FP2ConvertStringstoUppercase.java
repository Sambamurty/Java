package funtionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, use the Stream API to convert all strings to uppercase and collect them into a new list.

public class FP2ConvertStringstoUppercase {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("samba","sanjay","Kumari","srinu","Landa","Kasturibhai"));
		
		List<String> newList=
					list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(newList);
	}
}
