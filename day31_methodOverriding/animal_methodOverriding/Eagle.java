package day31_methodOverriding.animal_methodOverriding;

public class Eagle extends Animal{

    public Eagle(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" is eating snake");
    }
}
