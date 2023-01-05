package day37_exceptions_exceptionHandlings;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            System.out.println(5/0);
        }catch (RuntimeException e){
            System.out.println("runtime exception has been caught");
            e.printStackTrace();
        }finally { // it always will be executed
            System.out.println("finally block");
        }


    }
}
