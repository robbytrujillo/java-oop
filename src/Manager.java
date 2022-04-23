class Manager extends Employee{


//class Manager {
 //   String name;

    String company;

//    void sayHello(String name){
//        System.out.println("Hai " + name + " ,My Name is " + this.name);
//    }

//    Manager (){ //default constructor
//
//    }

    Manager(String name){
        super(name);
    }


//    Manager (String name){
//        this.name = name;
//    }

    Manager (String name, String company){
        //this.name = name;
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hai " + name + " ,My Name is Manager " + this.name);
    }
}
