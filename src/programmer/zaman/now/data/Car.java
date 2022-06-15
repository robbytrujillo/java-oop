package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Car", tags = {"application","java"})
public interface Car extends HasBrand, IsMaintenance{

    //public abstract void driver(); //public abstract --> tidak wajib bisa dihapus
    void driver();

    int getTire();

    default boolean isBig(){ //tidak dioveride si methodnya dan avanza tidak wajib lagi
        return false;
    }
}
