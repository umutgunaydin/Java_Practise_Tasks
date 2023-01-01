package day31_methodOverriding.animal_methodOverriding;

public class TestAnimalObject {
    public static void main(String[] args) {

        Cat cat=new Cat("emily","bangle","small","white",'f',4);
        Dog dog=new Dog("max","husky","medium","black",'m',3);
        Lion lion=new Lion("simba","african","large","orange",'m',7,true);
        Eagle eagle=new Eagle("bella","american","medium","white",'f',2);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("----------------");

        cat.eat();// these method are overridden but there just one eat() method!!!!
        dog.eat();
        lion.eat();
        eagle.eat();



    }
}
