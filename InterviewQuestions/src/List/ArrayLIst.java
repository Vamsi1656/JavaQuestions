package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLIst {
	
	
	public static void main(String args[]) {
		
		ArrayList al=new ArrayList<>();
		al.add("Vamsi");
		al.add(16);
		al.add(0.5);
		al.add("Vamsi");
		al.add(16);
		al.add(0.5);
		System.out.println(al);
		
		System.out.println(al.subList(2, 4));
		
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(12);
		a2.add(13);
		a2.add(14);
		a2.add(12);
		a2.add(13);
		a2.add(14);
		
		Collections.sort(a2);
		a2.forEach(System.out::println);
//		System.out.println(a2);
//		a2.removeAll(a2);
//		a2.forEach(a);
//		System.out.println(a2);
		
		ArrayList<Integer> a3=new ArrayList<>();
		a3.add(12);
		a3.add(13);
		a3.add(14);
		
		System.out.println(a3);
		
		
		a2.addAll(al);
		System.out.println(al);
		
		a2.addAll(0, a3);
		System.out.println(a2);
		
		
		
		List<Integer> a4=Arrays.asList(1,2,3,4,5);
		
		

	}
	
	
}