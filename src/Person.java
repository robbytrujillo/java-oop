class Person {
    String name;
    String address;
    final String country = "Indonesia"; // tidak bisa dirubah (final)

    Person(String paramName, String paramAddress){ //jika menambahkan parameter di construct maka akan terjadi error
        this.name = paramName;
        this.address = paramAddress;
    }

    Person(String paramName){ //jika menambahkan parameter di construct maka akan terjadi error
        this(paramName, null);

    }

    Person(){ //jika menambahkan parameter di construct maka akan terjadi error
        this(null);
    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My Name is " + this.name);
    }
}
