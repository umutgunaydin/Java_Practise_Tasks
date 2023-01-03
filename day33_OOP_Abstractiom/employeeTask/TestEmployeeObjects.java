package day33_OOP_Abstractiom.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("james", "b1", "math teacher", 45, 75000, 'm');
        Developer developer = new Developer("umut", "a4", "java developer", 34, 40000, 'm', "java");
        Driver driver = new Driver("brooks", "f4", "truck driver", 45, 120000, 'm');
        Tester tester = new Tester("emily", "r5", "manual tester", 54, 210000, 'f');


        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("-------------");

        teacher.work();
        developer.work();
        driver.work();
        tester.work();

    }
}
