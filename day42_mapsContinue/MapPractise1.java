package day42_mapsContinue;

import java.util.HashMap;
import java.util.Map;

public class MapPractise1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("---------------------------------------------");

        int numberOfMen=0;
        int numberOfWomen=0;

        for (String eachValue : employeeMap.values()) {

            if (eachValue.equalsIgnoreCase("f")){
                numberOfWomen++;
            }else {
                numberOfMen++;
            }
        }
        System.out.println("numberOfWomen = " + numberOfWomen);
        System.out.println("numberOfMen = " + numberOfMen);

        System.out.println("----------------------------------");

        // display the names of female employees
        for (String eachKey : employeeMap.keySet()) {
            if (employeeMap.get(eachKey).equalsIgnoreCase("f")){
                System.out.println(eachKey);
            }
        }

        System.out.println("-------------------------------------");

        // update m with male and f with female
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equalsIgnoreCase("f")){
                eachEntry.setValue("Female");
            }else {
                eachEntry.setValue("Male");
            }
        }
        System.out.println(employeeMap);



    }
}
