package FrequencyOfArrayorString;

public class FindingFrequency {
	
	public static void main(String args[]) {
//		Integer[] arr={0,1,2,3,4,5,1,2,3,4,6,5,2,3,4,5,7,8,9};
//		int[] count=new int[10];
//		
//		for(int num:arr) {
//			count[num]++;
//		}
//		for(int i=0;i<count.length;i++) {
//			if(count[i]>0);
//			System.out.println(i+"="+count[i]);
//		}
//		
		
	String s1="Missinaghskksnwnddnd";
       int[] c=new int[256];
		
		for(int i=0;i<s1.length();i++) {
			c[s1.charAt(i)]++;
		}
		for(int i=0;i<c.length;i++) {
			if(c[i]>0) {
			System.out.println((char)i +"="+c[i]);
			}
		}
		
	}

}
