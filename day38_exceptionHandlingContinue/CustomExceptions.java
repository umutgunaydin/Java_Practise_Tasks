package day38_exceptionHandlingContinue;

class CustomCheckedException extends Exception{

}

class CustomUncheckedException extends RuntimeException{

}

public class CustomExceptions {
    public static void main(String[] args) {

        try {
            throw new CustomCheckedException();
        }catch (CustomCheckedException e){
            e.printStackTrace();
        }

        System.out.println("----------------");

        try {
            throw new CustomUncheckedException();
        }catch (CustomUncheckedException e){
            e.printStackTrace();
        }


    }

}
