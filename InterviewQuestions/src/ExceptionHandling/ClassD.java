package ExceptionHandling;

public class ClassD  extends ClassC{
	
	void m2() throws ArithmeticException{
		
		System.out.println("D class M2 method");
	}
	
	public static void main(String args[]) {
		
		ClassC c=new ClassD();
		c.m2();
	}

}