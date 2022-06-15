package programmer.zaman.now.errror;

public class BlankException extends RuntimeException {

    public BlankException(String message){
        super(message);
    }

    public String getMessage(){
        return super.getMessage();
    }
}
