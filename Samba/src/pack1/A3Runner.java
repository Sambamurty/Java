package pack1;
abstract class Abstraction {
	protected String name;
	protected int age;
	Abstraction(String name, int age)
	{
		this.name = name;
		this.age  = age;
	}
	public String printer()
	{
		return String.format("Name : %s, Age : %d", name, age);
	}
}

class Funtionallity extends Abstraction{
	Funtionallity(String name, int age)
	{
		super(name,age);
	}
}
public class A3Runner{
	public static void main(String[] args) {
		Abstraction obj = new Funtionallity("samba", 22);
		System.out.println(obj.printer());
	}
}