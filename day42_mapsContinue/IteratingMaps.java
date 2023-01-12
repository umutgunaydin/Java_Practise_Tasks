package day42_mapsContinue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IteratingMaps {
    public static void main(String[] args) {

        Map<String,String> employees=new LinkedHashMap<>();

        employees.put("c02","josh");
        employees.put("b03","nora");
        employees.put("a02","tatyana");
        employees.put("a04","abidullah");
        employees.put("g09","tatyana");

        // iterating by the keys -- keySet()
        for (String eachKey : employees.keySet()) {
            System.out.println(eachKey);
        }

        System.out.println("------------------------");

        //iterating by the values -- values()
        for (String eachValue : employees.values()) {
            System.out.println(eachValue);
        }

        System.out.println("---------------------------");

        //iterating by the entries -- entrySet() -- entry is combination of key and value(pair)
        for (Map.Entry<String, String> eachEntry : employees.entrySet()) {
            System.out.println(eachEntry);
            System.out.println(eachEntry.getKey());
            System.out.println(eachEntry.getValue());
            eachEntry.setValue(eachEntry+"_added");
        }

        System.out.println(employees);



    }
}
