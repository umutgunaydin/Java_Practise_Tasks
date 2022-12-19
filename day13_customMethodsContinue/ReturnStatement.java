package day13_customMethodsContinue;

public class ReturnStatement {
    public static void main(String[] args) {

        eligible(15);
        System.out.println("------------------------------");

        System.out.println("test started");

        boolean exit=true;
        if (exit){
            return;//main method gets terminated
        }

        System.out.println("test completed");
    }

    public static void eligible(int age){
        if (age<0||age>150){
            System.err.println("Invalid age: "+age);
            return; //exits the method
        }

        if (age>=21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }
    }
}
