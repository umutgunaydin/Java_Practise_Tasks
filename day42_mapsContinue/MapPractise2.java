package day42_mapsContinue;
import java.time.LocalDate;
import java.util.*;
public class MapPractise2 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2021, 8, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);

        List<Map<String,Object>> mapList=new ArrayList<>();
        mapList.addAll(Arrays.asList(person1,person2,person3,person4,person5));

        for (Map<String, Object> eachPersonMap : mapList) {
            System.out.println(eachPersonMap);
            for (Map.Entry<String, Object> eachEntry : eachPersonMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }

        System.out.println("--------------------------------");

        for (Map<String, Object> eachPersonMap : mapList) {
            int year=((LocalDate)eachPersonMap.get("hired_date")).getYear();
            if (year==2022){
                System.out.println(eachPersonMap.get("name"));
            }
        }

        System.out.println("-----------------------------------");

        mapList.get(0).replace("name","Vasyl");
        System.out.println(mapList);

        System.out.println("-----------------------------------");

        mapList.get(mapList.size()-1).replace("salary",50000);

        System.out.println("---------------------------------");

        // increase the age
        mapList.get(1).replace("age",((Integer)mapList.get(1).get("age"))+4);

        System.out.println("--------------------------------------");

        Map<String,Object> car1=new LinkedHashMap<>();

        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color", "Red");
        car1.put("price", 45000.5);

        Map<String, Object> car2 = new LinkedHashMap<>();

        Map<String, Object> car3 = new LinkedHashMap<>();

        Map<String, Object> car4 = new LinkedHashMap<>();


        List<Map<String, Object>> cars = new ArrayList<>();
        cars.addAll( Arrays.asList(car1, car2, car3, car4));



    }
}
