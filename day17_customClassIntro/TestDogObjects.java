package day17_customClassIntro;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "max";
        dog1.breed = "husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.color = "gray";

        dog1.eat();

        System.out.println(dog1);

        Dog dog2=new Dog();

        dog2.name="loki";
        dog2.age=1;
        dog2.color="blue";

        System.out.println(dog2);

        Dog dog3=new Dog();
        dog3.setInfo("lucy","chow","medium",'M',6,"white");

        System.out.println(dog3);
    }
}
