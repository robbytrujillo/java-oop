class VicePresident extends Employee{

    VicePresident(String name){
    super(name);
    }

    void sayHello(String name){
        System.out.println("Hai " + name + " ,My Name is VP " + this.name);
    }

}
