package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class EmpDetails implements Serializable{
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
public class F8 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		EmpDetails em = new EmpDetails();
		em.setId(1);
		em.setName("Samba");
		em.setSalary(0);
		EmpDetails em1 = new EmpDetails();
		em1.setId(2);
		em1.setName("Murty");
		em1.setSalary(1234567);
		FileOutputStream fos = new FileOutputStream("/home/next/backup.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(em);oos.writeObject(em1);
		oos.close();
		
		FileInputStream fis = new FileInputStream("/home/next/backup.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		EmpDetails get = (EmpDetails) ois.readObject();
		EmpDetails get1 = (EmpDetails) ois.readObject();
		System.out.println(get+"\n"+get1);
		ois.close();
	}

}
