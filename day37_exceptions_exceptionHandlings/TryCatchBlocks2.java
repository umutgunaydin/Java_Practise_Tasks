package day37_exceptions_exceptionHandlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {
    public static void main(String[] args) {

        System.out.println("program1 started");

        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[1000]);
        } catch (RuntimeException e) {
            e.printStackTrace();// display full details of exception after execution // strongly recommended to use
        }


        System.out.println("program1 ended");
        System.out.println("----------------");
        System.out.println("program2 started");

        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // display non-detailed exception message
        }

        System.out.println("program2 ended");
        System.out.println("------------------------");
        System.out.println("program3 started");

        try {
            FileInputStream file = new FileInputStream("file path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("program3 ended");


    }
}
