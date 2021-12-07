package com.blz.generic;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    //Test Case for the Float where max_Value at First Position
    @Test
    public void given3FloatValue_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        Float actualResult = Maximum . getMax(15.6f,10.5f,11.5f);
        Float expectedResult = 15.6f;
        Assert.assertEquals(expectedResult,actualResult);
    }

     //  Test Case for the Float where max_Value at Second Position
    @Test
    public void given3FloatValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        Float actualResult = Maximum . getMax(11.1f,12.5f,10.6f);
        Float expectedResult = 12.5f;
        Assert.assertEquals(expectedResult,actualResult);
    }
    //  Test Case for the Float where max_Value at Third Position
    @Test
    public void given3FloatValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Maximum maximum = new Maximum();
        Float actualResult = Maximum . getMax(10.5f,15.6f,16.5f);
       Float expectedResult = 16.5f;
        Assert.assertEquals(expectedResult,actualResult);
    }

}
