package ExceptionHandling;

import java.io.IOException;

public class ClassH extends ClassG {
	
	void m4()  throws IOException{
		System.out.println("Hi");
	}
	
	public static void main(String args[]) throws IOException  {
		ClassG g= new ClassH();
		g.m4();
	}
}
