package day38_exceptionHandlingContinue;

import utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

        System.out.println("hello world");

        Library.sleep(2);

        System.out.println("how are you today");

        System.out.println("----------------------");

        if (LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreakTimeException("it is time to go home");
        }

    }
}
