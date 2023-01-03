package day34_OOP_AbstarctionContinue.animalTask;

public class Cat extends Animal implements Playable{

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+getName()+" is eating cat food");
    }

    @Override
    public void play() {

    }
}
