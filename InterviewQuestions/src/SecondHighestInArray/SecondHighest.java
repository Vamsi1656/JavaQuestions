package SecondHighestInArray;

import java.util.Arrays;

public class SecondHighest {
	
//	public static int secondhighest(int[] arr) {
//	
//
//	}
		
//		Arrays.sort(arr);
//		int first=arr[arr.length-1];
//		
//		for(int i=arr.length-2;i>=0;i++) {
//			if(arr[i]!=first) {
//				return arr[i];
//			}
//		}
//		
//		return -1;
//		
//	}
	public static void main(String args[]) {
//		int[] arr= {7,1,3,2,4,6,8};
//		System.out.println(secondhighest(arr));
//	}
		int[] arr={22,87,90,67,45,55};
	      Arrays.sort(arr);
	      System.out.println(arr[arr.length-3]);
	}
	
}
