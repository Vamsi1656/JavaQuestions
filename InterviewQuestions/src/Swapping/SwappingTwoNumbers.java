//How do you swap two numbers without using a third variable in Java?

package Swapping;

public class SwappingTwoNumbers {
	
	
	public static void main(String args[]) {
		
		int a= 10;
		int b= 20;
		  
		System.out.println("Before Swapping"+ " a is "+ a + " and b is "+ b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping"+ " a is "+ a + " and b is "+ b);
	}

}
