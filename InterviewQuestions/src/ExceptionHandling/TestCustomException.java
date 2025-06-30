package ExceptionHandling;

public class TestCustomException {
	
	
	static void validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("age is not valid");
		}else {
			System.out.println("Welcome to vote");
		}
	}
	
	public static void main(String args[])throws InvalidAgeException {
		try {
			validate(20);
		}
		catch(InvalidAgeException ie) {
			System.out.println("Caught the exception");
			
			System.out.println("ExceptionOccured"+ ie);
		}	
		
		System.out.println("Rest of the code");
		
	}

}
