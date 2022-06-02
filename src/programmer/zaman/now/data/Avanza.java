package programmer.zaman.now.data;

public class Avanza implements Car{

    public void driver() {
        System.out.println("Avanza Drive");
    }

    public int getTire() {
        return 4;

    }

    public String getBrand() {
        return "Toyoya";
    }

    public boolean isMaintenance() {
        return false;
    }
}
