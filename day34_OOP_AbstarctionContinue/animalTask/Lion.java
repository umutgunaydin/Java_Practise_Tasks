package day34_OOP_AbstarctionContinue.animalTask;

public class Lion extends Animal implements WildAnimal{
    public Lion(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating buffalo");
    }

    @Override
    public void hunt() {

    }
}
