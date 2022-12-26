package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today=LocalDate.now();
        System.out.println(today);

        LocalDate birthday=LocalDate.of(1996,3,26);
        System.out.println("birthday = " + birthday);

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());
        System.out.println(birthday.getDayOfWeek());

        today=today.plusYears(1);
        System.out.println(today);

        System.out.println("----------------------------");

        LocalDate graduationDate=LocalDate.of(2025,6,4);
        graduationDate=graduationDate.minusYears(4).minusMonths(3);
        System.out.println(graduationDate);

        // we have lots of method of this class--> check cheatsheets!!!!

        System.out.println("------------------------------");

        System.out.println(birthday.isBefore(today));

        System.out.println("---------------------");

        System.out.println(birthday.isLeapYear());






    }
}
