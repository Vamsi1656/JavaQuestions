package MissingNumber;

public class FindingMissingNumber {
	
	public static void main(String args[]) {
//		int[] arr={0,1,2,4,5};
//		int n=arr.length;
		int[] arr={1,2,4,5,6};
		int n=arr.length+1;
		
		int expectedSum=(n*(n+1))/2;
		int actualSum=0;
		
		for(int num:arr) {
			actualSum+=num;
		}
		
		int missingNumber=expectedSum-actualSum;
		System.out.println("MissingNumber="+missingNumber);
	}

}
