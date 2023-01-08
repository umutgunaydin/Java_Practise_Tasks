package day38_exceptionHandlingContinue;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException() {
    }

    public BreakTimeException(String message) {
        super(message);
    }

    public BreakTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public BreakTimeException(Throwable cause) {
        super(cause);
    }

    public BreakTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
