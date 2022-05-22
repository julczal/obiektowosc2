package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MojKalkulator mojKalkulator = new MojKalkulator();
        System.out.println(mojKalkulator.dodaj(3, 5));
        System.out.println(mojKalkulator.odejmij(4, 12));
        System.out.println(mojKalkulator.sinus(90));

        Kalkulator nowyKalkulator = new MojKalkulator();
        System.out.println(nowyKalkulator.dodaj(3, 5));
        System.out.println(nowyKalkulator.odejmij(4, 12));
    }
}
class MojKalkulator implements Kalkulator {
    public double sinus(double stopnie) {
        double radians = stopnie * PI / 180;
        return Math.sin(radians);
    }

    @Override
    public double dodaj(double l1, double l2) {
        return l1+l2;
    }

    @Override
    public double odejmij(double l1, double l2) {
        return l1-l2;
    }
}
interface Kalkulator {
    double dodaj(double l1, double l2);
    double odejmij(double l1, double l2);
    double PI = 3.14159;
}