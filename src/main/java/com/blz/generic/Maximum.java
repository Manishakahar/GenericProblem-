package com.blz.generic;
public class Maximum {
    public static void main(String[] args) {
        Integer intResult = getMax(20, 40, 60); // Integer Value
        System.out.println(intResult);
        Float floatResult = getMax(10.5f, 20.6f, 30.7f); // Float Value
        System.out.println(floatResult);
        String stringResult= getMax ("abc","pqr","XYZ"); // String Value
        System.out.println(stringResult);

    }

    // Generic Method
    public static <T extends Comparable> T getMax(T a, T b, T c) {
       // Compare Method
       if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
           return a;
       }
       else if (b.compareTo(a) > 0 && b.compareTo(c) >0){
           return b;
       }else {
           return c;
       }

    }
}
