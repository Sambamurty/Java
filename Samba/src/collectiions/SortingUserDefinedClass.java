package collectiions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Employee {//implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
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
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return Double.compare(this.salary, o.salary);
//	}
	
	
}
class Doublecomp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getSalary(), o1.getSalary());
	}
	
}
public class SortingUserDefinedClass {
	public static final int r = 32;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee,Double> obj = new HashMap<>();

		Employee emp = new Employee(5,"samba",40000);
		obj.put(emp, emp.getSalary());
		Employee emp1 = new Employee(2,"sai",323421);
		obj.put(emp1, emp1.getSalary());
		Employee emp2 = new Employee(1,"vamsi",112343);
		obj.put(emp2, emp2.getSalary());
		
		Map<Employee,Double> obj1 = new TreeMap<>(new Doublecomp());
		obj1.putAll(obj);
		
		for (Map.Entry<Employee, Double> entry : obj1.entrySet()) {
            System.out.println(entry.getKey().getId() + ": " + entry.getValue());
        }
		
		
		
		String s1="Samba is a good boy";
		String []temp= s1.split(" ");
		for(String i:temp)
		{
			StringBuilder s = new StringBuilder(i);
			String t = ""+s.reverse().toString().toLowerCase();
			t = t.substring(0, 1)+t.substring(1).toUpperCase();
			System.out.println(t);
		}
		
		
		System.out.println(r);
		 
	}

}
