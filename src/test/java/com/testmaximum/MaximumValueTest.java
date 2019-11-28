package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {

    @Test
    public void givenMethod_FindMaximumInteger_ReturnMaxValue() {

        MaximumValue maximumValue=new MaximumValue();

        Integer maxValue=maximumValue.findMaximumIntegerValue(40,70,30);

        Assert.assertEquals(Integer.valueOf(70),maxValue);

    }
}
