package String;

public class ReverseAString {
	
	public static void main(String args[]) {
		
//		String str="Virat";
//		
//		String reversed=new StringBuilder(str).reverse().toString();
//		
//		System.out.println(reversed);
		
		
		 String str="Jyothi";
         String reversed="";
         
         for(int i=str.length()-1;i>=0;i--){
             reversed +=str.charAt(i);
         }
         System.out.println(reversed);
		
		
	}

}
