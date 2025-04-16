package abstration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

class Employee implements Comparable<Employee>{
	protected int id;
	protected String name;
	protected double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public int compareTo(Employee that) {
		// TODO Auto-generated method stub
		if(this.salary<that.salary)
			return 1;
		else
			return -1;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

class Printer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t+" ");
	}
	
}

public class SecondHigestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Employee> compare = new Comparator<>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if(o1.salary<o2.salary)
					return 1;
				else
					return -1;
			}
			
		};
		Comparator<Employee> compare1 = (a,b)-> a.salary>b.salary?1:-1;
		//using functional programming and lambda expression
		//Comparator<Employee> compare = (o1, o2)->(o1.salary<o2.salary?1:-1);
		
		List<Employee> obj = new ArrayList<>();
		obj.add(new Employee(1,"Samba",23000));
		obj.add(new Employee(2,"nomi",50000));
		obj.add(new Employee(3,"noor",40000));
		obj.add(new Employee(4,"roshan",25000));
		Collections.sort(obj,compare1); // comparing using comparator
		
		obj.stream().forEach(e->System.out.println(e.toString()));
		System.out.println(obj.get(1));
		System.out.println(obj.stream().map(Employee::getSalary).distinct()
					.sorted((a,b)->a<b?1:-1)
					.skip(1).findFirst().orElse((double) 0));
		List.of(12,34,35,665).stream().forEach(new Printer());
		
		//getting second highest salary in traditional way
		
		double largestSalary = Double.MIN_VALUE;
		double secondLargest = Double.MIN_VALUE;
		for(Employee e:obj)
		{
			if(e.getSalary()>largestSalary)
			{
				secondLargest = largestSalary;
				largestSalary = e.getSalary();
			}
			else if(e.getSalary()>secondLargest && e.getSalary() != largestSalary)
			{
				secondLargest = e.getSalary();
			}
		}
		
		for(Employee e:obj)
		{
			if(secondLargest==e.getSalary())
			{
				System.out.println(e);
			}
		}
	}

}
