package exeptions;

public class RequestExeption extends Exception{
    public RequestExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
