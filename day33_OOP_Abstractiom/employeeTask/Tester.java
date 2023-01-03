package day33_OOP_Abstractiom.employeeTask;

public class Tester extends Employee{

    public Tester(String name, String id, String jobTitle, int age, double salary, char gender) {
        super(name, id, jobTitle, age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing");
    }
}
