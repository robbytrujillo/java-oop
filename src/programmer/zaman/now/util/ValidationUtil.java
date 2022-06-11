package programmer.zaman.now.util;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.errror.ValidationException;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null) {
            throw new ValidationException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is Blank");
        } else if (loginRequest.password() == null) {
            throw new ValidationException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is Blank");
        }
    }
}
