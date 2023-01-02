package day32_finalKeyword;

import java.time.LocalDate;

final class JavaStudent {// it cannot be inherited

    public final void language() {// it cannot be overridden
        System.out.println("java programming");
    }
}


public class FinalKeyword {
    public static void main(String[] args) {// there is no point of using final with static at the methods

        final char gender = 'M';
        System.out.println(gender);//M

        // gender='F';// compile error because this is not changeable
        System.out.println(gender);

        System.out.println("------------------------");

        final LocalDate dateOfBirth = LocalDate.now();// this is not changeable
        System.out.println(dateOfBirth);

        System.out.println("------------------------");

        String name = "james";//it is eligible for garbage collection

        name = "daniel";


    }
}
