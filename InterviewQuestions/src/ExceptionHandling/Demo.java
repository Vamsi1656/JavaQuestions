package ExceptionHandling;

public class Demo {
	
    public static void main(String args[]) {
    	
//    	int a =100/0;
//    	System.out.println(a);
    	try {
    		int a=100/0;
    	}
    	catch(ArithmeticException ae) {
    		int a=100/2;
    		System.out.println(a);
    		throw ae;
    	}
    }

}
