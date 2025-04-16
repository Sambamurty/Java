package collectiions;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Product{
	private int id;
	private String name;
	private double price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Product> com = (a,b)-> Double.compare(b.getPrice(), a.getPrice());
		Product p1 = new Product(1,"soap",30);
		Product p2 = new Product(2,"Comb",20);
		Product p3 = new Product(3,"Copper Bottle",200);
		Product p4 = new Product(4,"watch",3000);
		Product p5 = new Product(5,"Smart watch",2000);
		
		Queue<Product> queue = new PriorityQueue<>(com);
//		queue.offer(p1);
//		queue.offer(p2);
//		queue.offer(p3);queue.offer(p4);queue.offer(p5);
		queue.addAll(List.of(p1,p2,p3,p4,p5));
		while(!queue.isEmpty())
		{
			System.out.println(queue.poll());
		}
	}

}
