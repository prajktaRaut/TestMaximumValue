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
   public void givenMethod_PrintMaximumValueOfAllType_UsingInternallyCalledPrintMethod() {

       new MaximumValue<Integer,Float,String>(12,23,45,1.2f,2.1f,3.3f,"abc","xyz","pqr").testMaximum();

   }



}
