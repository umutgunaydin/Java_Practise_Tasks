package day38_exceptionHandlingContinue;

public class ThrowsKeyword {  // only for checked exceptions and this is just a temporary solution!!!!
    public static void main(String[] args) throws InterruptedException {

        System.out.println("program1 started");

        Thread.sleep(3000);// checked exception

        System.out.println("program1 ended");
        System.out.println("------------------");
        System.out.println("program2 started");

        Thread.sleep(5000);// checked exception

        System.out.println("program2 ended");



    }
}
