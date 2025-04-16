package pack1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A8subSequences {
	static Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		String tiles = sc.nextLine();
        Set<String> uniqueSequences = new HashSet<>();
        generateSequences("", tiles, uniqueSequences);
        System.out.println(uniqueSequences.size());

        
    }
     private static void generateSequences(String prefix, String tiles, Set<String> uniqueSequences) {
        if (!prefix.isEmpty()) {
            uniqueSequences.add(prefix);
            //System.out.println(prefix);
        }
        for (int i = 0; i < tiles.length(); i++) {
            generateSequences(prefix + tiles.charAt(i), tiles.substring(0, i) + tiles.substring(i + 1), uniqueSequences);
            System.out.println(prefix + tiles.charAt(i)+"    ------     "+ tiles.substring(0, i) + tiles.substring(i + 1));
        }
    }
}
