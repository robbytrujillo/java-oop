package programmer.zaman.now.data;

public class Cat extends Animal{ //error
//jika menggunakan abstract maka tidak akan error
    public void run(){
        System.out.println("Cat " + name + " is run");
    }
}
