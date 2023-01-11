package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,String> map=new TreeMap<>();

        System.out.println(map.size());

        map.put("c02","josh");
        map.put("b03","nora");
        map.put("a02","tatyana");
        map.put("a04","abidullah");
        map.put("g09","tatyana");

        System.out.println(map.size());

        System.out.println(map);

        System.out.println(map.get("a04"));

        map.put("a04","lucy"); // it will change the value of that key
        // it can be done by using replace() method
        map.replace("a04","aseel");// this one is faster

        System.out.println(map.get("a04"));

        System.out.println(map);

        // remove() removes the pairs at the given key
        map.remove("a04");

        System.out.println(map);

        // containsKey() checks included or not
        // containsValue() checks included or not
        System.out.println(map.containsKey("a04"));

        // isEmpty() checks empty or not
        System.out.println(map.isEmpty());

        //equals() compares maps if they are equal or not

        // clear() removes all the things inside map









    }
}
