package com.blz.generic;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void given3IntegerValue_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        int actualResult = Maximum . getMax(10,5,16);
        int expectedResult = 16;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void given3IntegerValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        int actualResult = Maximum . getMax(10,15,11);
        int expectedResult = 15;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void given3IntegerValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        int actualResult = Maximum . getMax(12,10,11);
        int expectedResult = 12;
        Assert.assertEquals(expectedResult,actualResult);
    }

}
