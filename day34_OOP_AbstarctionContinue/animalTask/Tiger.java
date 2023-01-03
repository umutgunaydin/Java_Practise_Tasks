package day34_OOP_AbstarctionContinue.animalTask;

public class Tiger extends Animal implements WildAnimal{

    public Tiger(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+getName()+" is eating deer");
    }

    @Override
    public void hunt() {

    }
}
