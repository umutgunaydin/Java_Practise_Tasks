package day35_OOP_Polymorphism;

import day33_OOP_Abstractiom.employeeTask.*;

public class Practise {
    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Hamza", "A01", "QA", 32, 110000, 'M'),
                new Developer("Lucy", "A02", "Java Developer", 27, 128000, 'F', "Java"),
                new Tester("George", "A03", "SDET", 28, 120000, 'M'),
                new Developer("Yulia", "A04", "Software Developer", 23, 135000, 'F', "Python"),
                new Tester("Cihad", "A05", "SDET", 30, 105000, 'M'),
                new Developer("Gulistan", "A06", "Web Developer", 26, 130000, 'F', "Python"),
                new Tester("Nora", "A07", "QE", 28, 120000, 'F'),
                new Driver("Aaron", "D1", "Truck Driver", 48, 90000, 'M'),
                new Developer("Diana", "A08", "Front-end Developer", 29, 140000, 'F', "C#"),
                new Tester("Tatiana", "A09", "SDET", 25, 130000, 'F'),
                new Developer("Alena", "A10", "Back-end Developer", 26, 150000, 'F', "Java"),
                new Tester("Timur", "A11", "SDET", 29, 115000, 'M'),
                new Teacher("James", "B1", "Math Teacher", 45, 75000, 'M'),
                new Developer("Hasan", "A12", "Full Stack Developer", 26, 142000, 'F', "Java"),
                new Tester("Nataliia", "A13", "QE", 24, 125000, 'F'),
                new Developer("Ermek", "A14", "Full Stack Developer", 26, 142000, 'M', "Java"),
                new Tester("Khashayar", "A15", "SDET", 30, 105000, 'M'),
        };

        for (Employee each : employees) {
            System.out.println(each.getName()+" : "+each.getJobTitle());
        }

        System.out.println("--------------------");

        int countDeveloper=0;
        int countTester=0;
        int countDriver=0;
        int countTeacher=0;

        for (Employee each : employees) {
            if (each instanceof Developer){
                countDeveloper++;
            } else if (each instanceof Tester) {
                countTester++;
            } else if (each instanceof Driver) {
                countDriver++;
            } else if (each instanceof Teacher) {
                countTeacher++;
            }
        }
        System.out.println("countDeveloper = " + countDeveloper);
        System.out.println("countTester = " + countTester);
        System.out.println("countDriver = " + countDriver);
        System.out.println("countTeacher = " + countTeacher);



    }
}
