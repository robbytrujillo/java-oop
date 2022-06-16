package programmer.zaman.now.util;

import programmer.zaman.now.annotation.NotBlank;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.errror.BlankException;
import programmer.zaman.now.errror.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    //checked exception wajib dideklarasikan
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is Blank");
        }
    }

    //runtime exception tidak wajib dideklarasikan
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is Blank");
        }
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields){
           field.setAccessible(true);

           if(field.getAnnotation(NotBlank.class) != null){
               //validate
               try{
               String value = (String) field.get(object);

               if(value == null || value.isBlank()){
                   throw new BlankException("Field " + field.getName() + " is Blank");
               }
           }catch (IllegalAccessException exception){
                   System.out.println("Tidak bisa mengakses field " + field.getName());
               }
        }}
    }
}
