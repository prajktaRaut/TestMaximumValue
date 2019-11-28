package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {

    @Test
    public void givenMethod_FindMaximumInteger_ReturnMaxIntegerValue() {

        Integer maxValue=MaximumValue.findMaximumIntegerValue(40,70,30);
        Assert.assertEquals(Integer.valueOf(70),maxValue);
    }

    @Test
    public void givenMethod_FindMaximumFloat_ReturnMaxFloatValue() {

        Float maxValue=MaximumValue.findMaximumFloatValue(0.5f,1.2f,5.3f);
        Assert.assertEquals(Float.valueOf(5.3f),maxValue);
    }

    @Test
    public void givenMethod_FindMaximumString_ReturnMaxStringValue() {

        String maxValue=MaximumValue.findMaximumStringValue("abc","xyz","pqr");
        Assert.assertEquals("xyz",maxValue);
    }

    @Test
    public void givenMethod_FindMaximumValue_ReturnMaxValueOfInteger_UsingGenerics() {

        Integer maxValue=new MaximumValue<Integer>(10,20,30).testMaximum();
        Assert.assertEquals(Integer.valueOf(30),maxValue);
    }

    @Test
    public void givenMethod_FindMaximumValue_ReturnMaxValueOfFloat_UsingGenerics() {

        Float maxValue=new MaximumValue<Float>(1.1f,5.2f,3.3f).testMaximum();
        Assert.assertEquals(Float.valueOf(5.2f),maxValue);
    }

    @Test
    public void givenMethod_FindMaximumValue_ReturnMaxValueOfString_UsingGenerics() {

        String maxValue=new MaximumValue<String>("lmn","pqr","abc").testMaximum();
        Assert.assertEquals("pqr",maxValue);
    }

}
