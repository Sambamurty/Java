package pack1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class A6hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> obj = Map.of(1,"Mad",2,"Max",3,"Fury");
		Map.entry(4, "Safa"); //This will be not inserted as it is immutable Map.
		System.out.println(obj);
		System.out.println("To get size of Map: obj.size() - "+obj.size());
		System.out.println("To get value of particular key: obj.get(o) - "+obj.get(2));
		System.out.println(obj.isEmpty());
		System.out.println("To check whether the key or value present in the map: obj.containsKey(o) or containsValue(o) - "+ obj.containsKey(4));
		Map<Integer, String> hashmap = new HashMap<>(obj);	
		hashmap.put(5, "Prem");
		hashmap.put(3, "Samba");
		System.out.println(hashmap);
	}

}
