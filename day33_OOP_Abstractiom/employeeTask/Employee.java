package day33_OOP_Abstractiom.employeeTask;

public abstract class Employee {

    private final String name, id;
    private String jobTitle;
    private final int age;
    private double salary;
    private final char gender;

    public Employee(String name, String id, String jobTitle, int age, double salary, char gender) {
        this.name = name;
        this.id = id;
        setJobTitle(jobTitle);
        this.age = age;
        setSalary(salary);
        this.gender = gender;
    }

    public abstract void work();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public char getGender() {
        return gender;
    }
}
