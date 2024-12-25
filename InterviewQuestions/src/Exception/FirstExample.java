package Exception;

public class FirstExample {
	
	
	
	public static void main(String args[]) {
		
		
		try {
		int data=100/0;
		}
		catch(ArithmeticException e) {
//			int data =100/2;
//			System.out.println(data);
		}
		
		finally {
			System.out.println("Hello");
		}
		
//		System.out.println(data);
	}

}
