package Factorial;

public class FindFactorial {
	
//	public static int m1(int n) {
//		if(n==0 || n==1 ) return 1;
//
//		return n*m1(n-1);
		
//		  int a = 1;
//	        for (int i = 2; i <= n; i++) {
//	            a *= i;
//	        }
//	        return a;
//	 		
//	}
		
	
	public static void main(String[] args) {
		
		int n=5;
		int a=1;
		for(int i=2;i<=n;i++) {
			a*=i;
		}
		
		System.out.println(a);
	}

}
