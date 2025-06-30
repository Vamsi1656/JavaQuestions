package ExceptionHandling;

public class ClassD  extends ClassC{
	
	void m2() {
		
		System.out.println("D class M2 method");
	}
	
	public static void main(String args[]) throws ArithmeticException{
		
		ClassC c=new ClassD();
		c.m2();
	}

}
