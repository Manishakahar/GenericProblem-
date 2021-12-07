package com.blz.generic;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Welcome Generics Problem");
    }

    public static Float getMax(Float a, Float b, Float c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        }
        return c;
    }

}
