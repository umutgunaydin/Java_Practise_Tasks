package day42_mapsContinue;

import java.util.LinkedHashMap;
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

        Map<String,String> employees=new LinkedHashMap<>();
        // putAll() merges two maps
        employees.putAll(map);

        System.out.println(employees);

        System.out.println(employees==map);// false because of different memory
        System.out.println(employees.equals(map)); // true because of elements are same // it compares order by order so order is important



// iterating methods will be in the IteratingMaps class





    }
}
