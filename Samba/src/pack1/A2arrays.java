package pack1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

class Student{
	private String name;
	private int listOfMarks[];
	public Student(String name, int[] listOfMarks) {
		this.name = name;
		this.listOfMarks = listOfMarks;
	}
	public int getNumberOfMarks(){
		return listOfMarks.length;
	}
	public int getSumOfMarks() {
		int sum=0;
		for(int i=0;i<listOfMarks.length;i++)
		{
			sum=sum+listOfMarks[i];
		}
		return sum;
	}
	public int getMaximumMarks() {
		Arrays.sort(listOfMarks);
		return listOfMarks[listOfMarks.length-1];
	}
	public BigDecimal getAverageMarks() {
		BigDecimal avg = new BigDecimal(0);
		for(int i=0;i<listOfMarks.length;i++)
		{
			avg = avg.add(new BigDecimal(listOfMarks[i]));
		}
		return avg.divide(new BigDecimal(getNumberOfMarks()), 3, RoundingMode.CEILING);
	}
	
}

public class A2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {97, 98, 100};
		Student stu = new Student("samba", marks);
		System.out.println(stu.getNumberOfMarks());
		System.out.println(stu.getSumOfMarks());
		System.out.println(stu.getMaximumMarks());
		System.out.println(stu.getAverageMarks());
	} 
}
