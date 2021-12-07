package com.blz.generic;
// Main Class
public class Maximum {
    //Main Method
    public static void main(String[] args) {
        System.out.println("Welcome Generics Problem"); // Print Welcome Message
    }
// Passed the Float Value
    public static Float getMax(Float a, Float b, Float c) {
        // Compare the Float Value
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        }
        return c;
    }

}
