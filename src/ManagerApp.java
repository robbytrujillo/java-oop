public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Robby");
        manager.sayHello("Asep");

        var vicePresident = new VicePresident("Ilham");
        vicePresident.sayHello("Asep");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vicePresident);
        System.out.println(vicePresident.toString());//toString adalah method bawaan class Object.java
    }
}
