package day29_OOP_Inheritance;

public class Cat extends Animal{

    public void meow(){
        System.out.println(getName()+" is meowing");
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }

}
