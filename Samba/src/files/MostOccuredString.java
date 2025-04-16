package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MostOccuredString {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("/home/next/TextFile.txt");
		BufferedReader br = new BufferedReader(fr);

		StringBuilder s = new StringBuilder();
		
		String i;
		while((i=br.readLine()) != null)
		{
			s.append(i+" ");
		}
		
		System.out.println(s);
		br.close();
		String s1 = s.toString();
		s1 = s1.trim();
		String []arr = s1.split(" ");
		
		int max = 0; String word=""; 
		for(int t=0;t<arr.length;t++)
		{
			int flag = 0;
			for(int j=0;j<t;j++)
			{
				if(arr[t].equals(arr[j]))
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				int c=0;
				for(int k=t;k<arr.length;k++)
				{
					if(arr[t].equals(arr[k]))
					{
						c++;
					}
				}
				System.out.println(arr[t]+" "+c);
				if(c>max)
				{
					max = c;
					word = arr[t];
				}
			}
		}
		System.out.println(word+" "+max);
	}

}
