package com.blz.generic;

public class Maximum {
    //Passed the String Value
   public static String stringMax(String a, String b, String c) {
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
