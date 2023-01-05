package day37_exceptions_exceptionHandlings;

import day34_OOP_AbstarctionContinue.transportationTask.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {

        System.out.println("program 1 started");

        Car car=null;

        try {
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("first catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){ // parent exception class must be placed after child class !!!!!!!!!
            System.out.println("fourth catch block");
            e.printStackTrace();
        }


        System.out.println("program 1 ended");



    }
}
