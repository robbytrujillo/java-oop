public class PolymorphismApp {
    public static void main(String[] args) {

        //polymorphism : perubahan bentuk
        Employee employee = new Employee("Robby");
        employee.sayHello("Ilham");

        employee = new Manager("Robby");
        employee.sayHello("Ilham");

        employee = new VicePresident("Robby");
        employee.sayHello("Ilham");

        sayHello(new Employee("Robby"));
        sayHello(new Manager("Ilham"));
        sayHello(new VicePresident("Kusuma"));

    }
    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else{
            System.out.println("Hello " + employee.name);
        }

        }


}
