package com.blz.generic;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    //Test Case for the String where max_Value at First Position
    @Test
    public void given3StringValue_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        String actualResult = Maximum.stringMax("xyz","abc","PQR");
        String expectedResult = "xyz";
        Assert.assertEquals(expectedResult,actualResult);
    }

     //  Test Case for the String where max_Value at Second Position
    @Test
    public void given3StringValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        String actualResult = Maximum . stringMax("ABC","pqr","XYZ");
        String expectedResult = "pqr";
        Assert.assertEquals(expectedResult,actualResult);
    }

    //  Test Case for the String where max_Value at Third Position
    @Test
    public void given3StringValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        String actualResult = Maximum . stringMax("XYz","ABC","abc");
        String expectedResult = "abc";
        Assert.assertEquals(expectedResult,actualResult);
    }
}
