package List;

import java.util.LinkedList;

public class LinikedList {
	
	
	public static void main(String args[]) {
		
		LinkedList<Integer> l1=new LinkedList<>();
		
		l1.add(12);
		l1.add(14);
		l1.add(26);
		l1.add(33);
		l1.add(15);
		l1.add(45);
		l1.add(18);
		l1.add(7);
		System.out.println(l1);
		l1.sort(null);
		System.out.println(l1);
		
		
		
	}

}