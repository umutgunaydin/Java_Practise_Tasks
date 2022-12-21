package day17_customClassIntro;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("muhtar", 23, 'm', "java developer", 90000, "a43");

        Employee employee2 = new Employee();
        employee2.setInfo("jonny", 65, 'f', "python developer", 32123, "g54");

        employee1.name="osman";//we can change it later like this

        System.out.println(employee1);
        System.out.println(employee2);

        employee2.work();
    }
}
