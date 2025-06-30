package Streams.findMaxElementinLIst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingMax {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,44,5,6,78};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		
		
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,10,44,5,6,78);
		int max=l1.stream().max(Integer::compare).get();
		System.out.println(max);
		
		
		List<Integer> l2=Arrays.asList(1,2,3,4,5,6,7,8,9,10,44,5,6,78);
		Optional<Integer> secondmax=l2.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
		secondmax.ifPresent(System.out::println);
//		System.out.println(secondmax);

		
	}

}
