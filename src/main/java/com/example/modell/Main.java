package com.example.modell;

import java.util.Arrays;
import java.util.List;
import static com.example.modell.Auto.*;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto("VW Touran", 88888, 7999.99, "weiß", false, "Benzin", 101.0);
        System.out.println(a);
        // VW Touran (Benzin; 101,0 PS; weiß; 88888 km) für 7999,99 EUR !!! UNFALLFREI !!!
        Auto b = new Auto("Ford Focus", 139000, 3999.99, "metallic", true, "Diesel", 103.5);
        System.out.println(b);
        // Ford Focus (Diesel; 103,5 PS; metallic; 139000 km) für 3999,99 EUR

        List<Auto> cars = Arrays.asList(
                new Auto("VW Touran", 88888, 7999.99, "weiß", false, "Benzin", 101.0),
                new Auto("Ford Focus", 139000, 3999.99, "metallic", true, "Diesel", 103.5),
                new Auto("C-Klasse", 25000, 23999.99, "metallic", false, "Diesel", 153),
                new Auto("VW Golf", 39000, 33999.99, "blue racing", false, "Benzin", 193.5),
                new Auto("Citroen Clio", 19000, 23999.99, "silber", true, "Gas", 103.5),
                new Auto("VW Up", 31000, 23999.99, "post yellow", false, "Elektro", 73.5)
        );

        System.out.println(accidents(cars));
        System.out.println(fuel(cars, "Elektro"));
        System.out.println(fuel(cars, "elektro"));
        System.out.println(fuel(cars, "Diesel"));
    }
}
