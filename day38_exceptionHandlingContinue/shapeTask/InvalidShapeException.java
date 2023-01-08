package day38_exceptionHandlingContinue.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message) {
        super(message);
    }
}
