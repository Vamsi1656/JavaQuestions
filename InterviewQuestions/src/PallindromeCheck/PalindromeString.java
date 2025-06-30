package PallindromeCheck;

public class PalindromeString {
	
	public static boolean checkpalindromestring(String input) {
		
//		return str.equals(new StringBuilder(str).reverse().toString());

//		int length = input.length();

		 for (int i = 0; i < input.length() / 2; i++) {
		        if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
		            return false;
		        }
		    }

	return true;
	}
		
//		int left =0,right=input.length()-1;
//		
//		while(left<right) {
//			if(input.charAt(left)!=input.charAt(right)) return false;
//				left ++;
//				right --;
//			
//		}
//			return true;
//	}	
	public static void main(String args[]) {
		
		 String test1 = "level";
		 String test2 = "hello";

		 System.out.println(test1 + " is palindrome? "+checkpalindromestring(test1));
		 System.out.println(test2 + " is palindrome? "+checkpalindromestring(test2));
//		System.out.println(checkpalindromestring("madam"));
//		System.out.println(checkpalindromestring("racecar"));
//		System.out.println(checkpalindromestring("Hello"));
//		System.out.println(checkpalindromestring("java"));
//
		
		 
		 
	}

}
