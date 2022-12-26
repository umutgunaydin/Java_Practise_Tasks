package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("d MMMM y");

        LocalDate today=LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date=LocalDate.of(2021,5,3);
        System.out.println(date.format(df));

        System.out.println("---------------------");

        DateTimeFormatter tf=DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime now=LocalTime.now();
        System.out.println(now.format(tf));

        System.out.println("----------------------");

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE, dd/MMM/y  HH:mm");

        LocalDateTime rightNow=LocalDateTime.now();
        System.out.println(rightNow.format(dtf));

        System.out.println("------------------------");


    }
}
