package programmer.zaman.now.data;

public class Bus implements Car{
    public void driver() {
        System.out.println("Bus Drive");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "HINO";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() { //hanya bisa di Java versi 8.0
        return true;
    }
}
