package com.blz.generic;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    //  Test Case for the Integer where max_Value at First Position
    public void given3IntegerValue_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        int actualResult = Maximum . getMax(16,15,10);
        int expectedResult = 16;
        Assert.assertEquals(expectedResult,actualResult);
    }
      //  Test Case for the Integer where max_Value at Second Position
    @Test
    public void given3IntegerValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        int actualResult = Maximum . getMax(10,15,11);
        int expectedResult = 15;
        Assert.assertEquals(expectedResult,actualResult);
    }
    //  Test Case for the Integer where max_Value at Third Position
    @Test
    public void given3IntegerValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        int actualResult = Maximum . getMax(11,10,12);
        int expectedResult = 12;
        Assert.assertEquals(expectedResult,actualResult);
    }

}
