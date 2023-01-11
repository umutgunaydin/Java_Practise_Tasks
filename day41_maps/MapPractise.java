package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractise {
    public static void main(String[] args) {

        Map<String,Object> person1=new LinkedHashMap<>();
        person1.put("name","arthur");
        person1.put("gender",'m');
        person1.put("age",34);
        person1.put("job_title","developer");
        person1.put("salary",10000.5);
        person1.put("married",true);

        System.out.println("person1 = " + person1);

        System.out.println(person1.get("name")); // it returns the value of that key



    }
}
