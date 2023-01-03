package day34_OOP_AbstarctionContinue.animalTask;

public class Eagle extends Animal implements Flyable, WildAnimal{

    public Eagle(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" is eating snake");
    }

    @Override
    public void fly() {

    }

    @Override
    public void hunt() {

    }
}
