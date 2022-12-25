package day23_arrayList_CollectionsUtility;

import day17_customClassIntro.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("josh", 34, 'm', "java developer", 100000, "a01");
        employees.get(1).setInfo("emily", 40, 'f', "sdet", 90000, "a02");
        employees.get(2).setInfo("conor", 38, 'm', "project manager", 130000, "a03");
        employees.get(3).setInfo("bella", 29, 'f', "java developer", 95000, "a04");
        employees.get(4).setInfo("jimmy", 54, 'm', "data analyst", 105000, "a05");

        // names and job titles
        for (Employee each : employees) {
            System.out.println(each.name + ": " + each.jobTitle);
        }

        System.out.println("----------------------");

        //java developers
        for (Employee each : employees) {
            if (each.jobTitle.equals("java developer")) {
                System.out.println(each.name + ": " + each.jobTitle);
            }
        }

        System.out.println("--------------------------");

        // get min-max salary
        double min = employees.get(0).salary;
        double max = employees.get(0).salary;

        for (Employee each : employees) {
            if (each.salary > max) {
                max = each.salary;
            }
            if (each.salary < min) {
                min = each.salary;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------");

        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for (Employee each : employees) {
            if (each.gender == 'm') {
                maleEmployees.add(each);
            } else {
                femaleEmployees.add(each);
            }
        }
        System.out.println(femaleEmployees);
        System.out.println("Total female employees: "+femaleEmployees.size());
        System.out.println(maleEmployees);
        System.out.println("Total male employees: "+maleEmployees.size());


    }
}
