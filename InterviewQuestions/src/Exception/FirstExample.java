package Exception;

public class FirstExample {
	
	
	
	public static void main(String args[]) {


		int[] arr=new int[5];
		System.out.println(arr[10]);
		
		
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
