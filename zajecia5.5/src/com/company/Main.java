package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 10, 20};
        int ele = 30;
        WyszukiwanieRownych wyszukiwanieRownych = new WyszukiwanieRownych();
        int index = wyszukiwanieRownych.szukaj(a, ele);
        if (index == 1) System.out.println("nie znaleziono");
        else System.out.println("znaleziono w indeksie numer " + index);
    }
}
abstract class Wyszukiwanie {
    boolean porownaj(int x, int y) {
        return x == y;
    }
    int szukaj(int a[], int ele) {
        for (int i = 0; i < a.length; i++) {
            if (porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;
    }
}
class WyszukiwanieRownych extends Wyszukiwanie {
    @Override
    boolean porownaj(int x, int y) {
        return x == y;
    }
}
class WyszukiwanieNierownych extends Wyszukiwanie {
    @Override
    boolean porownaj(int x, int y) {
        return x != y;
    }
}