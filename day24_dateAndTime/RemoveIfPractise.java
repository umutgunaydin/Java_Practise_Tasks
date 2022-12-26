package day24_dateAndTime;

import day17_customClassIntro.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfPractise {
    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", "Medium", 'M', 4, "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", "Large", 'F', 8, "Gold");
        dogs[2].setInfo("Molly", "Beagle", "Small", 'F', 5, "White");
        dogs[3].setInfo("Oliver", "Bulldog", "Small", 'M', 2, "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", "Small", 'F', 3, "White");
        dogs[5].setInfo("Loki", "Chow Chow", "Medium", 'M', 7, "Gold");

        ArrayList<Dog> smallDogs=new ArrayList<>(Arrays.asList(dogs));

        // with loop
        /*
        for (Dog eachDog : dogs) {
            if (eachDog.size.equalsIgnoreCase("Small")){
                smallDogs.add(eachDog);
            }
        }
        System.out.println("Small Dogs: "+smallDogs);
         */

        // without loop
        smallDogs.removeIf(each -> !each.size.equalsIgnoreCase("small"));
        System.out.println("smallDogs = " + smallDogs);

        System.out.println("----------------------");

        ArrayList<Dog> youngDogs=new ArrayList<>(Arrays.asList(dogs));
        youngDogs.removeIf(each -> each.age>4);
        System.out.println("youngDogs = " + youngDogs);

        System.out.println("------------------------");

        ArrayList<Dog> femaleDogs=new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(each->each.gender=='M');
        System.out.println("femaleDogs = " + femaleDogs);

        System.out.println("---------------------------");

        ArrayList<Dog> maleDogs =new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(each->each.gender=='F');
        System.out.println("maleDogs = " + maleDogs);





    }
}
