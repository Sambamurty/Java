package com.practice;

public class LongestPalindromicSubString {
	
	public static String reverseString(String temp)
    {
        return new StringBuilder(temp).reverse().toString();
    }
    public String longestPalindrome(String s) {
        String longSubString = "";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String temp = s.substring(i,j);
                //System.out.println(temp+"   "+reverseString(temp)+"   "+temp.equals(reverseString(temp)));
                if(temp.equals(reverseString(temp)) && temp.length()>longSubString.length())
                {
                    longSubString = temp;
                    System.out.println(longSubString);
                }
            }
        }
        return longSubString;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubString obj = new LongestPalindromicSubString();
		System.out.println(obj.longestPalindrome("babad"));
	}

}
