package Streams.FindFirstelement;

import java.util.Arrays;
import java.util.List;

public class FindingFirst {
	
	public static void main(String args[]) {
		List<Integer> l1=Arrays.asList(44,55,6,78,2,38,89,3,2);
		
		if(!l1.isEmpty()) {
			System.out.println(l1.get(0));
			
			List<Integer> l2=Arrays.asList(44,55,6,78,2,38,89,3,2);
			l2.stream().findFirst().ifPresent(System.out::println);
			
		}
	}

}
