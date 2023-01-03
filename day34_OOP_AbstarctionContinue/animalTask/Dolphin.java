package day34_OOP_AbstarctionContinue.animalTask;

public class Dolphin extends Animal implements Swimmable{

    public Dolphin(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+getName()+" is eating fish");
    }

    @Override
    public void swim() {

    }
}
