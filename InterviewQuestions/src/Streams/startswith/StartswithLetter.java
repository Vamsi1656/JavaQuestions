package Streams.startswith;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartswithLetter {
	
	public static void main(String args[]) {
		List<String> s1=Arrays.asList("Pallavi","Virat","Nani","Jyothi","Nikhi","Vamsi","Aruna","Vvreddy");
		List<String> filtered=s1.stream()
		.filter(s->s.startsWith("V"))
//		.forEach(System.out::println);
		.collect(Collectors.toList());
		
		System.out.println(filtered);
		
		
		
		List<Integer> i=Arrays.asList(10,24,35,66,78,98,45,32,22,2,1,25);
		List<String> arr=i.stream().map(s->s+"").filter(s->s.startsWith("2")).collect(Collectors.toList());
		System.out.println(arr);
	}

}
