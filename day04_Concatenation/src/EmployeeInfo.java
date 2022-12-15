public class EmployeeInfo {
    public static void main(String[] args) {

        int age = 28,
                salary = 90_000;

        String name = "Daniel",
                gender = "Male",
                companyName = "Google Inc",
                jobTitle = "Software Developer";

        System.out.println("Given Data:");
        System.out.println("\t\tname = " + name);
        System.out.println("\t\tage = " + age);
        System.out.println("\t\tgender = " + gender);
        System.out.println("\t\tcompanyName = " + companyName);
        System.out.println("\t\tjobTitle = " + jobTitle);
        System.out.println("\t\tsalary = " + salary);

        System.out.println("Output:\n\t"+name+" is "+age+" years old, gender is "+gender+".");
        System.out.println("\t"+name+" works at "+companyName+" as a "+jobTitle+".");
        System.out.println("\t"+name+" makes $"+salary+" per year.");


    }
}
