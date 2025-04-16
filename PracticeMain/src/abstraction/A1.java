package abstraction;

interface I1{
	void interfaceOne();
}
interface I2{
	void iTwo();
}
interface I3 extends I1,I2{
	String iThree(String s);
	static void iThreeDef()
	{
		System.out.println("Defined Method in interface 3.");
	}
}
abstract class A{
	A(){}
	A(int a,int b)
	{
		System.out.println(a+b);
	}
	String method()
	{
		return "Samba";
	}
	abstract public int abstractMethod(int i);
}
class B{
	private int age;
	private String name;
	B(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	void m1(){
		System.out.println(name+" "+age);
	}
}
class C extends A implements I3{

	C(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public C() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interfaceOne() {
		// TODO Auto-generated method stub
		System.out.println("interfaceOne");
	}

	@Override
	public void iTwo() {
		// TODO Auto-generated method stub
		System.out.println("iTwo");
	}

	@Override
	public String iThree(String s) {
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public int abstractMethod(int i) {
		// TODO Auto-generated method stub
		return i;
	}
	
}
class Test{
	void display(I3 i3)
	{
		i3.interfaceOne();
		System.out.println(i3.iThree("iThree"));
		i3.iTwo();
		I3.iThreeDef();
	}
	void display(A a, int i, int j)
	{
		System.out.println(a.abstractMethod(10));
		System.out.println(a.method());
		new C(i,j);
	}
}
public class A1 {
	public static void main(String[] args) {
		B objB = new B(22, "Samba");
		objB.m1();
		Test t = new Test();
		t.display(new C());
	}
	
}
