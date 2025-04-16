package abstration;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dog cat cat dog";
		String pattern = "abba";
		Map<Character, String> obj = new HashMap<>();
        char[] charPattern = pattern.toCharArray();
        String[] stringS = s.split(" ");
        for(int i=0;i<charPattern.length;i++)
        {
            if(obj.containsKey(charPattern[i]) 
            && obj.get(charPattern[i])!=stringS[i])
            {
                System.out.println("False");
            }
            else {
            	obj.put(charPattern[i],stringS[i]);
            }
            
        }
        System.out.println(obj);
	}

}
