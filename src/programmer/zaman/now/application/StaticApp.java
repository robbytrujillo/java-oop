package programmer.zaman.now.application;

import static programmer.zaman.now.data.Application.PROCESSORS;
//import programmer.zaman.now.data.Application;
import static programmer.zaman.now.data.Constant.*;
//import programmer.zaman.now.data.Constant;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {

        //System.out.println(Constant.APPLICATION);
        //System.out.println(Constant.VERSION);
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,1,1,1,1)
        );

    Country.City city = new Country.City();
    city.setName("Bandung");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
        //System.out.println(Application.PROCESSORS);

    }
}
