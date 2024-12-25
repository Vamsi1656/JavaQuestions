package ExceptionHandling;

import java.io.IOException;

public class ClassH extends ClassG {
	
	void m4(){
		System.out.println("Hi");
	}
	
	public static void main(String args[]) throws IOException  {
		ClassG g= new ClassH();
		g.m4();
	}
}
