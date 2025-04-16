package exception.handling;

import java.util.Scanner;

public class ADivideException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter Numorator Number: ");
		int numrator = sc.nextInt();
		System.out.print("\nEnter Denominator Number: ");
		int denominator = sc.nextInt();
		int []a = {1,3,4,4};
		try {
			System.out.println(numrator/denominator);
			System.out.println(a[sc.nextInt()]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}

}
