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

    @Test
    public void givenMethod_FindMaximumString_ReturnMaxStringValue() {

        String maxValue=maximumValue.findMaximumStringValue("abc","xyz","pqr");
        Assert.assertEquals("xyz",maxValue);
    }

    @Test
    public void givenMethod_FindMaximumValue_ReturnMaxValueOfInteger_UsingGenerics() {

        Integer maxvalue=MaximumValue.FindMaxValueOfAnyType(12,23,34);
        Assert.assertEquals(Integer.valueOf(34),maxvalue);
    }

    @Test
    public void givenMethod_FindMaximumValue_ReturnMaxValueOfFloat_UsingGenerics() {

        Float maxvalue=MaximumValue.FindMaxValueOfAnyType(1.2f,2.3f,3.4f);
        Assert.assertEquals(Float.valueOf(3.4f),maxvalue);
    }

    @Test
    public void givenMethod_FindMaximumValue_ReturnMaxValueOfString_UsingGenerics() {

        String maxvalue=MaximumValue.FindMaxValueOfAnyType("abc","xyz","pqr");
        Assert.assertEquals("xyz",maxvalue);
    }


}
