package day23_arrayList_CollectionsUtility;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str="aabbbcccc";

        String[] list=str.split("");
        String result="";

        for (String each : list) {
            int frequency= Collections.frequency(Arrays.asList(list),each);

            if (!result.contains(each)){
                result+=each+frequency;
            }
        }
        System.out.println("result = " + result);




    }
}
