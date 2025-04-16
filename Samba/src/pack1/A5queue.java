package pack1;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class LengthComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(),o2.length());
	}
}
public class A5queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> obj = new PriorityQueue<>(new LengthComparator());
		obj.offer("Samba");
		obj.addAll(List.of("master", "of", "peace"));
		System.out.println(obj);
		obj.poll();
		obj.offer("A");
		System.out.println(obj);
	}

}
