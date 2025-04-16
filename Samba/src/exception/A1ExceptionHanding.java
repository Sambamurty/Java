package exception;

import java.util.Scanner;

//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
class IsEven extends Exception{
	IsEven(String s)
	{
		super(s);
	}
}
public class A1ExceptionHanding {
//	public static void check(int num) throws IsEven
//	{
//		if(num%2!=0)
//		{
//			throw new IsEven("The number is odd.");
//		}
//		else
//		{
//			System.out.println("You Can Proceed Further.");
//		}
//	}
	public static void main(String[] args) throws IsEven {
		int num = new Scanner(System.in).nextInt();
//		try {
			if(num%2 == 0)
			{
				throw new IsEven("The number is Even.");
			}
			else
			{
				System.out.println("Sucess");
			}
//		}catch(IsEven e) {
//			e.printStackTrace();
//		}	
		
//		try {
//			check(num);
//		} catch (IsEven e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
	}
}
