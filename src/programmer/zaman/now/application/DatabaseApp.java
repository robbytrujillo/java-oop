package programmer.zaman.now.application;

import programmer.zaman.now.errror.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
//        metode Try catch --> Direkomendasikan dibuat untuk Error yang sangat fatal sekali
//        try {
//            connectDatabase("robby", null);
//            System.out.println("Sukses");
//        }catch (DatabaseError error){
//            System.out.println("Error" + error.getMessage());
//        }
        connectDatabase("robby", null);
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new  DatabaseError("Tidak bisa konek ke database");
        }
    }
}
