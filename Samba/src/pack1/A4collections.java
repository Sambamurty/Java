package pack1;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class A4collections {
	public static void main(String[] args) {
		List<Character> characters = List.of('A','Z','B','Z','A');
		System.out.println(characters);
		Set<Character> treeset = new TreeSet<>(characters); //It gives sorted order
		Set<Character> linkedhashset = new LinkedHashSet<>(characters); //It gives insertion order
		System.out.println(treeset);
		System.out.println(linkedhashset);
		treeset.add('D');
		treeset.add('H');
		System.out.println(treeset);
		TreeSet<Integer> inttreeset = new TreeSet<>();
		inttreeset.add(4);
		inttreeset.add(7);
		inttreeset.add(1);
		inttreeset.add(13);
		inttreeset.add(3);
		System.out.println(inttreeset);
		System.out.println(inttreeset.ceiling(6));
		System.out.println(inttreeset.floor(3));
		System.out.println(inttreeset.lower(7));
		System.out.println(inttreeset.higher(10));
		System.out.println(inttreeset.subSet(3,13));
		System.out.println(inttreeset.subSet(3,false,13,true));
	}
}
