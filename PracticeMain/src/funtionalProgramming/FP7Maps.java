package funtionalProgramming;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FP7Maps {
	public static void main(String[] args) {
		
		List<Integer> keys = List.of(1,2,3,4);
		List<String> values = List.of("Landa","Noori","Samba","Roshan");
		
		
		Map<Integer,String> map = IntStream.range(0, keys.size()).boxed().collect(Collectors.toMap(i->keys.get(i),i->values.get(i)));
		map.forEach((k,v)->System.out.println(k+" - "+v));
		
		Map<Integer, List<String>> groupedByLength = 
				map.values().stream().collect(Collectors.groupingBy(e->e.length()));
		groupedByLength.forEach((k,v)->System.out.println(k+" - "+v));
	}
}
