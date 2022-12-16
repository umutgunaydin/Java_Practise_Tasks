package day03_variables;

public class EmployeeInfo {
    public static void main(String[] args) {

        String name = "Daniel";
        int age = 32;
        char gender = 'M';
        String companyName = "Apple INC";
        String employeeId = "A2654";
        String jobTitle = "Java Developer";
        int salary = 100000;
        boolean isFullTime = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFullTime);

        System.out.println("----------------------------");
        //shortcut for intelliJ---->> soutv and hit enter and select the variable
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
    }
}
