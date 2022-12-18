package day12_customMethods;

public class CallingTest {
    public static void main(String[] args) {

        int number=30;

        CustomMethodsWithParameter.oddOrEven(number);

        String name="ahmet";
        String lastName="veli";

        InitialsOfPerson.initialsOfPerson(name,lastName);

    }
}
