package com.blz.generic;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void given3FloatValue_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        Float actualResult = Maximum . getMax(5.6f,5.5f,15.5f);
        Float expectedResult = 15.5f;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void given3FloatValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        Float actualResult = Maximum . getMax(5.1f,12.5f,5.6f);
        Float expectedResult = 12.5f;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void given3FloatValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        Float actualResult = Maximum . getMax(10.5f,5.6f,5.5f);
       Float expectedResult = 10.5f;
        Assert.assertEquals(expectedResult,actualResult);
    }

}
