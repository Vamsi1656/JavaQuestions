package Streams.occurnacesofeachcharacter;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class findingoccurances {

    public static void main(String[] args){
//        int[] arr={1,2,3,4,5,1,2,3,4,5,2,3,4,5,7,8,};
//
//        HashMap<Integer,Integer> m1=new HashMap<>();
//
//        for(int num:arr){
//            m1.put(num,m1.getOrDefault(num,0)+1);
//        }
//        System.out.println(m1);

        Integer[] arr={1,2,3,4,5,1,2,3,4,5,2,3,4,5,7,8,};
        Map<Integer,Long> m1=Arrays.stream(arr)
                .collect(Collectors.groupingBy(e->e, Collectors.counting()));

//        m1.forEach((key,value)->System.out.println(key+ value));
        System.out.println(m1);
    }
}
