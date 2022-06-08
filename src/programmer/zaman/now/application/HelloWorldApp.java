package programmer.zaman.now.application;

import programmer.zaman.now.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        HelloWorld english = new HelloWorld(){ //namanya anonomous class, kekurangannya tidak bisa di rius

            public void sayHello() {        //namanya anonomous class
                System.out.println("Hello"); //namanya anonomous class
            }

            public void sayHello(String name) { //namanya anonomous class
                System.out.println("Hello" + name); //namanya anonomous class
            }
        };

        HelloWorld indonesia = new HelloWorld(){ //namanya anonomous class, kekurangannya tidak bisa di rius

            public void sayHello() {        //namanya anonomous class
                System.out.println("Halo"); //namanya anonomous class
            }

            public void sayHello(String name) { //namanya anonomous class
                System.out.println("Halo" + name); //namanya anonomous class
            }
        };

        english.sayHello();
        english.sayHello("Robby");

        indonesia.sayHello();
        indonesia.sayHello("Robby");
    }
}
