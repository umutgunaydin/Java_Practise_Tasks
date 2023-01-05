package day37_exceptions_exceptionHandlings;

public class TryCatchBlocks {
    public static void main(String[] args) {


        System.out.println("test started");


        try {
            System.out.println(9 / 0);
            System.out.println("try block");
        } catch (RuntimeException e) {
            System.out.println("catch block");
        }

        System.out.println("program1 ended");
        System.out.println("-----------------");
        System.out.println("program2 started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("try block");
        } catch (RuntimeException e){
            System.out.println("catch block");
        }

        System.out.println("program2 ended");
        System.out.println("----------------------");
        System.out.println("program3 started");

        try {
            Thread.sleep(3000);
            System.out.println("try block");
        }catch (InterruptedException e){
            System.out.println("catch block");
        }

        System.out.println("program3 ended");



    }
}
