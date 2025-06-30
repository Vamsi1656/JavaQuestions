package MapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
	
	  public static void main(String args[]){

	       HashMap<Integer,String> employees= new HashMap();
	        employees.put(1,"Nani");
	        employees.put(2,"Pallavi");
	        employees.put(3,"Virat");
	        employees.put(4,"Jyothi");
	        System.out.println(employees);
	        
	        
	       Set set =employees.entrySet();  //Converting to Set so that we can traverse  
	       Iterator itr=set.iterator();
	       while(itr.hasNext()) {
	    	   Map.Entry entry=(Map.Entry)itr.next();
	    	   System.out.println(entry.getKey()+" "+entry.getValue());
	       }

}
}
