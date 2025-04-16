package com.practice;

//Longest Substring Without Repeating Characters

public class LongestsubString {

	public static void main(String[] args) {
		String s = "abcabcbb";
		int maxLength = 0;
        int left = 0;
        int[] charIndex = new int[128]; 
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, charIndex[currentChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            charIndex[currentChar] = right + 1;
        }
        System.out.println(maxLength);
	}

}
