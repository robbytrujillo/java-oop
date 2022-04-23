public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Robby", "Bandung" ); //field --> masukkan parameter "Robby", "Bandung"
//        person1.name = "Robby Ilham"; //field --> bisa dihapus (tidak perlu) karena sudah ada parameter di constructor
//        person1.address = "Bandung";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        var person2 = new Person("Robby"); //field --> masukkan parameter "Robby", "Bandung"
//        person1.name = "Robby Ilham"; //field --> bisa dihapus (tidak perlu) karena sudah ada parameter di constructor
//        person1.address = "Bandung";

        System.out.println(person2.name);


//        var person3 = new Person(); //field --> masukkan parameter "Robby", "Bandung"
////        person1.name = "Robby Ilham"; //field --> bisa dihapus (tidak perlu) karena sudah ada parameter di constructor
////        person1.address = "Bandung";
//
//        System.out.println(person3.name);

        person1.sayHello("Alex");

        //Person person2 = new Person("Alex", "Jakarta"); // tambah paramerter "Alex", "Jakarta" di constructor
        Person person3;
        person3 = new Person();
        person3.name = "Murya";
        //person3 = new Person("doddy", "Garut"); // tambah paramerter "doddy", "Garut" di constructor
//        person3.name = "doddy"; //dihapus
        person3.sayHello("Boy");

        //constructor adalah method yang pertama kali dipanggil ketika pertama kali objek di buat
    }
}
