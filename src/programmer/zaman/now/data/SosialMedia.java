package programmer.zaman.now.data;

class SosialMedia {
    String name;
}

//final class Facebook extends SosialMedia{
//
//}

//Ini Error
//class FakeFacebook extends Facebook{
//
//}

class Facebook extends SosialMedia{
    final void login(String username, String password){
    //isi method
    }
}

class FakeFacebook extends Facebook{
    //jadi error
    //void login(String username, String password){
    //isi method
    //    }
}

