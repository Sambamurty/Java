package collectiions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortingMapByKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> obj = new LinkedHashMap<>();
		obj.putAll(Map.of("Samba",1,"Murty",2,"Sanjay",3,"Srinu",4));
		
		HashMap<String,Integer> sorted = obj.entrySet().
												stream().
												sorted((a,b)->a.getKey().compareTo(b.getKey())).
												collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(a,b)->a,LinkedHashMap::new));
		System.out.println(sorted+" - Sorted by using Streams.\n");
		obj.clear();
		
		obj.putAll(Map.of("Am",2,"Pm",5,"Cm",1,"Gm",8,"Rm",7));
		Map<String, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
		treeMap.putAll(obj);
		System.out.println(treeMap+" - TreeMap\n");
		
		
		
		LinkedList<String> ll = new LinkedList<>(obj.keySet());
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll+" - Sorting only keys using Linkedlist\n");
		
		
		LinkedList<Map.Entry<String,Integer>> list = new LinkedList<>(obj.entrySet());
		Comparator<Map.Entry<String,Integer>> com = new Comparator<>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}};
		Comparator <Map.Entry<String,Integer>> com1 = (a,b)->b.getValue().compareTo(a.getValue());
		Collections.sort(list,com1);	
		//System.out.println(list);
		//Map<String, Integer> obj1 = new TreeMap<>();
		obj.clear();
		for(Map.Entry<String, Integer> i:list)
		{
			obj.put(i.getKey(), i.getValue());
		}
		System.out.println(obj+" - Sorting using comparator of linkedList\n");
		System.out.println(treeMap);
		
	}

}
