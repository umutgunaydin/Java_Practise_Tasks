package day29_OOP_Inheritance;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("max", "husky", 'm', 3, "large", "white");

        Cat cat = new Cat();
        cat.setInfo("felicia", "stray", 'f', 3, "medium", "black");

        Tiger tiger = new Tiger();
        tiger.setInfo("shere kyan", "bengal", 'm', 5, "large", "orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("-----------------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();
        dog.bark();

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.meow();
        cat.scratch();

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.hunt();
    }
}
