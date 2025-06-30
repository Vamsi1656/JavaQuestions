package Streams.evenorodd;

import java.util.Arrays;
import java.util.List;

public class FindingEvenorOdd {
	
	public static void main(String args[]) {
		int[] arr= {2,44,13,25,46,37,88};
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) 
//				System.out.println(arr[i]);
//			
//		}
		
		Arrays.stream(arr)
		.filter(n->n%2==0)
		.forEach(System.out::println);
		
		System.out.println();
		
		List<Integer> l1=Arrays.asList(2,44,13,25,46,37,88);
		l1.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);
		
		
	}

}
