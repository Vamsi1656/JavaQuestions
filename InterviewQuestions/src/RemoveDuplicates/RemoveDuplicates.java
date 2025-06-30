package RemoveDuplicates;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        List<Integer> uniqueList = new ArrayList<>();

        for (int num : arr) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }


        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }

   
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
