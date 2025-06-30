package SortingArray;

import java.util.Arrays;
import java.util.List;

public class ArraySorting {
	
	
	public static void main(String args[]) {
		int[] arr= {7,4,8,2,9,1,5,0};
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println();
		
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//
//        System.out.println(Arrays.toString(arr));
//		for(int num : arr) {
//			System.out.println(num);
//		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		for(int num : arr) {
			System.out.println(num);

		}

//
//		System.out.println();
		
//		List<Integer> l1=Arrays.asList(7,4,8,2,9,1,5,0);
//		l1.stream().sorted().forEach(System.out::println);
	}

}
