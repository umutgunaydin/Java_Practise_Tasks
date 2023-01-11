package day41_maps;

import java.util.*;

public class MapClasses { // pair of key and value---key cannot be duplicated
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();// random order, accepts null key & null values
        hashMap.put("brooks", 15000);
        hashMap.put("bella", 85000);
        hashMap.put("ciguli", 3500);
        hashMap.put("kafa", 1500);
        hashMap.put(null,null); // key cant be duplicated so it can be used only once as key

        System.out.println("hashMap = " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();// insertion order, accepts nul key & null values
        linkedHashMap.put("brooks", 15000);
        linkedHashMap.put("bella", 85000);
        linkedHashMap.put("ciguli", 3500);
        linkedHashMap.put("kafa", 1500);
        linkedHashMap.put(null,null);// key cant be duplicated so it can be used only once as key

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>();// sorted ascending order by keys, does not accept null key but accepts null values
        treeMap.put("brooks", 15000);
        treeMap.put("bella", 85000);
        treeMap.put("ciguli", 3500);
        treeMap.put("kafa", 1500);
        treeMap.put("null olmaz",null);

        System.out.println("treeMap = " + treeMap);
        
        Map<String, Integer> hashTable = new Hashtable<>(); // random order, does not accept null key & null values , synchronized
        hashTable.put("brooks", 15000);
        hashTable.put("bella", 85000);
        hashTable.put("ciguli", 3500);
        hashTable.put("kafa", 1500);
        try {
            hashTable.put("null olmaz",null);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("hashTable = " + hashTable);

    }
}
