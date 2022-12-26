package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        LocalTime startingTime=LocalTime.of(10,30,55);
        System.out.println(startingTime);

        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);

        System.out.println("--------------------");

        currentTime=currentTime.plusHours(2);
        System.out.println(currentTime);





    }
}
