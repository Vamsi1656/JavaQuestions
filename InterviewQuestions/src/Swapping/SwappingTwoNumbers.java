//How do you swap two numbers without using a third variable in Java?

package Swapping;

public class SwappingTwoNumbers {
	
	
	public static void main(String args[]) {
		
		int a= 10;
		int b= 20;
		int temp;
		System.out.println("Before Swapping");
		System.out.println("a is"+ a);
		System.out.println("b is"+ b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping ");
		System.out.println("a is" + a);
		System.out.println("b is"+ b);
		  
//		System.out.println("Before Swapping"+ " a is "+ a + " and b is "+ b);
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("After Swapping"+ " a is "+ a + " and b is "+ b);
	}

}
