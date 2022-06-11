package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.errror.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        //ValidationUtil.validate(loginRequest);
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException exception){
            System.out.println("Data tidak Valid: " + exception.getMessage());
        }
    }
}
