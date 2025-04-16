package abstration;

import java.util.List;	
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class FuntionalProgram{
	
	public static void main(String[] args) {
		List<String> list = List.of("mark","shiva","samba","pushpa");
		System.out.print("Print a List using Stream Api : ");
		list.stream().forEach(ele->System.out.print(ele+" "));
		//list.stream().forEach(System.out::println);
		System.out.println("\n");
		
		
		System.out.print("Printing list of String which ends with 'a' using Stream Api : ");
		list.stream().filter(ele->ele.endsWith("a")).forEach(ele->System.out.print(ele+" "));
		System.out.println("\n");
		
		
		List<Integer> nlist = List.of(22,21,43,44,65,88,90);
		System.out.print("Printing even number in alist: ");
		nlist.stream().filter(ele-> ele%2==0).forEach(ele->System.out.print(ele+" "));
		System.out.println("\n");
		
		
		System.out.print("Printing Even elements in odd place as list: ");
		List<Integer> evenAtOddplaces = //if we use mapToObj no need of using boxed() - mapToObj(nlist::get)
		IntStream.range(1, nlist.size()).filter(i->i%2 == 1 && nlist.get(i)%2==0).map(e->nlist.get(e)).boxed().collect(Collectors.toList());
		System.out.println(evenAtOddplaces+"\n");
		
		
		System.out.print("Printing sum of even numbers in the list : ");
		int evenSum = nlist.stream().filter(ele->ele%2==0).reduce(0, (a,b)->a+b);
		System.out.println(evenSum+"\n");
		System.out.print("Printing sum of numbers in the list : ");
		int sum = nlist.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum+"\n");
		
		
		System.out.print("Printing squares of first 10 numbers : ");
		IntStream.range(1, 11).map(ele->ele*ele).forEach(ele->System.out.print(ele+" "));
		System.out.println("\n");
		
		System.out.print("Converting to lowercase in list : ");
		List<String> list1 = List.of("As", "samBa", "closE", "Epeba");
		list1.stream().map(ele->ele.toLowerCase()).forEach(ele->System.out.print(ele+" ")); 
		//for length of string we use length() in place of toLowerCase()
		System.out.println("\n");
		
		
		System.out.print("Creating a list of squares of first 10 numbers : ");
		List<Integer> lis = IntStream.range(1, 11).mapToObj(e -> e*e).collect(Collectors.toList());
		System.out.println(lis);
		
		
		List<Character> charList = List.of('a','r','t','y','r');
		List<Character> collect = charList.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}