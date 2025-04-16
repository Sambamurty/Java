package com.practice;

import java.util.HashMap;

public class SmallestSubstring {
	public static String longestCommonPrefix(String[] strs) {
        int smallString = Integer.MAX_VALUE;
        String small = "";
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()<smallString)
            {
                smallString = strs[i].length();
                small=""+strs[i];
            }
        }
        //System.out.println(small+" "+smallString);
        int counter = 0;
        int flag = 0;
        for(int i=0;i<smallString;i++)
        {
            for(int j=0;j<strs.length;j++)
            {
            	//System.out.println(small.charAt(i)+" != "+strs[i].charAt(j));
                if(small.charAt(i) != strs[j].charAt(i))
                {
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
            counter++;
        }
        return small.substring(0,counter);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[] = {"flower","flow","fight"};
		System.out.println(longestCommonPrefix(strs));
		
		String s = "abcabcsf";
		int longSub = 0;
        for(int i=0;i<s.length();i++)
        {
            HashMap< Character, Integer> obj = new HashMap<>();
            int temp =0;
            for(int j=i;j<s.length();j++)
            {
                if(!obj.containsKey(s.charAt(j)))
                {
                    obj.put(s.charAt(j),j);
                    temp++;
                }
                else{
                    break;
                }
            }
            if(temp>longSub)
            {
                longSub = temp;
            }
            System.out.println(obj);
        }
        System.out.println(longSub);
	}

}
