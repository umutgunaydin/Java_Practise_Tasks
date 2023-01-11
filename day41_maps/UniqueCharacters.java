package day41_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str="aabcccdeeeef";

        Map<String,Integer> map=new LinkedHashMap<>();

        String[] strArray=str.split("");

        for (String each : strArray) {
            int frequency= Collections.frequency(Arrays.asList(strArray),each);
            if (frequency==1){
                map.put(each,frequency);
            }
        }

        System.out.println(map);


    }
}
