package worker;

public class YearOverCurrentException extends Exception{
    public YearOverCurrentException() {
    }

    public YearOverCurrentException(String message) {
        super(message);
    }

    public YearOverCurrentException(String message, Throwable cause) {
        super(message, cause);
    }

    public YearOverCurrentException(Throwable cause) {
        super(cause);
    }

    public YearOverCurrentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
