package exception;

public class ErrorThrowing extends RuntimeException {

    private final String errorCode;
    private final String url;

    // Constructor 1: Message only (standard for RuntimeException)

    public ErrorThrowing(String message) {
        super(message);
        this.errorCode = null; // Or some default/empty string
        this.url = null;     // Or some default/empty string
    }

    // Constructor 2: Message, errorCode, and url
    public ErrorThrowing(String message, String errorCode, String url) {
        super(message); // Call the superclass constructor with the message
        this.errorCode = errorCode;
        this.url = url;
    }

    // Constructor 3: Message and a Throwable cause
    public ErrorThrowing(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = null;
        this.url = null;
    }

    // Constructor 4: Message, Throwable cause, errorCode, and url
    public ErrorThrowing(String message, Throwable cause, String errorCode, String url) {
        super(message, cause);
        this.errorCode = errorCode;
        this.url = url;
    }

    // You might want to add constructors that also take a 'Throwable cause'
    // as RuntimeException has constructors for that as well.

    public String getErrorCode() {
        return errorCode;
    }

    public String getUrl() {
        return url;
    }
}