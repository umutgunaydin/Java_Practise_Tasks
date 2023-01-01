package day31_methodOverriding.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat(){
        System.out.println("Cat "+getName()+" is eating cat food");
    }
    @Override
    public void sleep(){
        System.out.println("Cat "+getName()+" sleeps 12 hours in a day");
    }


}
