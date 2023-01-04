package day35_OOP_Polymorphism;

import day30_OOP_InheritanceContinue.phoneTask.IPhone;
import day30_OOP_InheritanceContinue.phoneTask.Nokia;
import day30_OOP_InheritanceContinue.phoneTask.Phone;
import day30_OOP_InheritanceContinue.phoneTask.Samsung;

public class PolymorphismPractise {
    public static void main(String[] args) {


        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Gold", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "White", 99),
                new Nokia("G50", "Large", "Pink", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Pink", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Black", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Small", "Gold", 400),
                new IPhone("Iphone 7", "Small", "White", 500)
        };


        for (Phone each : phones) {
            System.out.println(each.getModel() + " - " + each.getColor() + " - " + each.getPrice());
        }

        System.out.println("-------------------------");

        int numberOfIPhones = 0;
        int numberOfSamsungs = 0;

        for (Phone each : phones) {
            if (each instanceof IPhone) {
                numberOfIPhones++;
            } else if (each instanceof Samsung) {
                numberOfSamsungs++;
            }
        }

        System.out.println("numberOfIPhones = " + numberOfIPhones);
        System.out.println("numberOfSamsungs = " + numberOfSamsungs);

        System.out.println("----------------------------");

        for (Phone each : phones) {
            if ((each instanceof IPhone || each instanceof Samsung) && (each.getPrice() >= 700)) {
                System.out.println(each.getModel() + " is expensive than 700$");
            }
        }


    }
}
