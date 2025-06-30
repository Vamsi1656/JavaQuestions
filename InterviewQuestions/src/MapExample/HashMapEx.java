package MapExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String args[]) {
		Map<Integer,String> m1=new HashMap<>();
		m1.put(101, "Virat");
		m1.put(102, "Rohit");
		m1.put(103, "Bumrah");
		m1.put(104, "Hardik");
		m1.put(105, "Rahul");
		
		System.out.println(m1);
		
		Set<Integer> s1=m1.keySet();
		System.out.println(s1);
		
		Collection<String> c1=m1.values();
		System.out.println(c1);
		
		List<String> l1=new ArrayList<>(c1);
		
		Collections.sort(l1);
		System.out.println(l1);
	}

}
