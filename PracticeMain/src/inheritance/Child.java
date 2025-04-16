package inheritance;

class Parent{
	int a = 10;
}
public class Child extends Parent{
	int a = 20;
	
	void method()
	{
		System.out.println(a);
		System.out.println(super.a);//we can access base class properties by using super keyword.
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
