package exception.handling;

public class DThrowsKeyWord{
	public void method1() throws ArithmeticException
	{
		System.out.println(12/0);
		System.out.println("Method 1");
	}
	public void method2() throws ArithmeticException
	{
		method1();// If we use try catch here then not need of using throws for method1
		//try{method1();}catch(ArithmeticException e){e.printStackTrace();}
		System.out.println("Method 2");
	}
	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		DThrowsKeyWord obj = new DThrowsKeyWord();
		obj.method2();
		System.out.println("Main Method");
	}

}
