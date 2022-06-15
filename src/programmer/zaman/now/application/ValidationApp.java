package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.errror.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {

    @Fancy(name = "AnimalApp", tags = {"application","java"})
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        //Kode : Multiple Try Catch
//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data Valid");
//        } catch (ValidationException exception) {
//            System.out.println("Terjadi Error Dengan Pesan : " + exception.getMessage());
//        } catch (NullPointerException exception) {
//            System.out.println("Data Null : " + exception.getMessage());
//        }

        //Kode : Multiple Try Catch (2)
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Terjadi Error Dengan Pesan : " + exception.getMessage());
        }finally {
            System.out.println("Error gak error, tetap di panggil");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");

    }
}
