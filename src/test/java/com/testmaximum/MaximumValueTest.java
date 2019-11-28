package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {

    MaximumValue maximumValue=new MaximumValue();

    @Test
    public void givenMethod_FindMaximumInteger_ReturnMaxIntegerValue() {

        Integer maxValue=maximumValue.findMaximumIntegerValue(40,70,30);

        Assert.assertEquals(Integer.valueOf(70),maxValue);

    }

    @Test
    public void givenMethod_FindMaximumFloat_ReturnMaxFloatValue() {

        Float maxValue=maximumValue.findMaximumFloatValue(0.5f,1.2f,5.3f);

        Assert.assertEquals(Float.valueOf(5.3f),maxValue);

    }
}
