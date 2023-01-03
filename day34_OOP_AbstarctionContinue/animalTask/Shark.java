package day34_OOP_AbstarctionContinue.animalTask;

public class Shark extends Animal implements WildAnimal,Swimmable{

    public Shark(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Shark "+getName()+" is eating fish");
    }

    @Override
    public void hunt() {

    }

    @Override
    public void swim() {

    }
}
