package day34_OOP_AbstarctionContinue.animalTask;

public class Duck extends Animal implements Playable, Flyable,Swimmable{
    public Duck(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" is eating worm");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
