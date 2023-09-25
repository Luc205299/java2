
public class CustException extends java.lang.Exception {
    public CustException() {
        super("Factorial Exception: Invalid input (not between 1 and 10 )");
    }
    public CustException(String message) {
        super("Factorial Exception: " + message);
    }
}