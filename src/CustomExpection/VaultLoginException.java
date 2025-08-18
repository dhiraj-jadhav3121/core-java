package CustomExpection;

public class VaultLoginException extends RuntimeException {

    public VaultLoginException(String message){
        super(message);
    }
}
