package worker;

public class WrongFormatYearException extends Exception{
    public WrongFormatYearException() {
    }

    public WrongFormatYearException(String message) {
        super(message);
    }

    public WrongFormatYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongFormatYearException(Throwable cause) {
        super(cause);
    }

    public WrongFormatYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
