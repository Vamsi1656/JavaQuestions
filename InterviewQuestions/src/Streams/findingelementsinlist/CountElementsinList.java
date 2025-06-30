package Streams.findingelementsinlist;

import java.util.Arrays;
import java.util.List;

public class CountElementsinList {
	
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,2,3,5,6,78);
		
		int count=l1.size();
		System.out.println(count);
		
		
		List<Integer> l2=Arrays.asList(1,2,3,5,6,78);
		long count1=l2.stream().count();
		System.out.println(count1);
	}

}
