package day38_exceptionHandlingContinue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException{

        pauseFor5Seconds();// there will be exception again and we need to use throws again and again!!!!!!

    }

    public static void pauseFor5Seconds() throws InterruptedException{
        Thread.sleep(5000);
    }

    public static void method1() throws InterruptedException, FileNotFoundException {
        System.out.println("first program started");
        Thread.sleep(3000);
        System.out.println("first program ended");

        new FileInputStream(" ");

        Thread.sleep(5000);
    }


}
