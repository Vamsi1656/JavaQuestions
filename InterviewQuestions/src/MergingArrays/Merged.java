package MergingArrays;

import java.util.Arrays;

public class Merged {

    public static void main(String[] args){
            int[] arr1= {1, 3, 2, 4, 6, 7};
            int[] arr2 = {2, 5, 10, 9, 8, 3, 4, 5};

            int[] merged=new int[arr1.length+arr2.length];
            int index=0;
            for(int num : arr1) merged[index++]=num;
            for(int num : arr2) merged[index++]=num;

        Arrays.sort(merged);
        int [] result=removeduplicates(merged);

        System.out.println(Arrays.toString(result));

    }

    private static int[] removeduplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        return Arrays.copyOf(temp,j);
    }
}
