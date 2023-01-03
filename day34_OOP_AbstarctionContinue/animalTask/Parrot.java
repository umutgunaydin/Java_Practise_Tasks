package day34_OOP_AbstarctionContinue.animalTask;

public class Parrot extends Animal implements Playable, Flyable{

    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Parrot "+getName()+" is eating parrot food");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }
}
