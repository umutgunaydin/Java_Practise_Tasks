package day12_customMethods;

public class InitialsOfPerson {
    public static void main(String[] args) {

        initialsOfPerson("ali","veli");

    }

    public static void initialsOfPerson(String name,String lastName){

        String initial=name.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();
        System.out.println("initial = " + initial);

    }


}
