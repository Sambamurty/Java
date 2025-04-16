package pack1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class A7countOfCharByMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This string is used to check whether the given string has to";
		char[] arr = s.toCharArray();
		Map<Character, Integer> obj = new HashMap<>();
		for(char character:arr)
		{
			Integer integer = obj.get(character);
			if(integer==null)
				obj.put(character, 1);
			else
				obj.put(character, integer+1);
		}
		System.out.println(obj);
		
		Map<String, Integer> obj1 = new LinkedHashMap<>();
		String []arrs = s.split(" ");
		for(String str:arrs)
		{
			Integer i = obj1.get(str);
			if(i==null)
				obj1.put(str, 1);
			else
				obj1.put(str, i+1);
		}
		System.out.println(obj1);
	}

}
