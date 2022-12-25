package day23_arrayList_CollectionsUtility;

import day17_customClassIntro.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsFromCollection {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);
                i--;// it shifts that is why we need this
            }
        }
        System.out.println(list);

        System.out.println("-----------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(list2);

        list2.removeIf(p -> p < 4);
        System.out.println(list2);

        System.out.println("---------------------");

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("java","c","java","python","javascript"));
        System.out.println(names);

        names.removeIf(each -> each.equals("java"));
        System.out.println(names);

        System.out.println("------------------------");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("josh", 34, 'm', "java developer", 100000, "a01");
        employees.get(1).setInfo("emily", 40, 'f', "sdet", 90000, "a02");
        employees.get(2).setInfo("conor", 38, 'm', "project manager", 130000, "a03");
        employees.get(3).setInfo("bella", 29, 'f', "java developer", 95000, "a04");
        employees.get(4).setInfo("jimmy", 54, 'm', "data analyst", 105000, "a05");

        System.out.println(employees);

        employees.removeIf(each -> each.salary>100000);
        System.out.println(employees);

        for (Employee employee : employees) {
            System.out.println("Name: "+employee.name+"  Salary: "+employee.salary);
        }


    }
}
