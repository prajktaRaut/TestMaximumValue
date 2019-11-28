package com.testmaximum;

public class MaximumValue {

    public Integer findMaximumIntegerValue(Integer a, Integer b, Integer c) {

        if (a.compareTo(b)>0)
            return a ;

        if (b.compareTo(c)>0)
            return b;

        if (c.compareTo(a)>0)
            return c;

        return null;

    }


    public Float findMaximumFloatValue(Float a, Float b, Float c) {

        if (a.compareTo(b)>0)
            return a ;

        if (b.compareTo(c)>0)
            return b;

        if (c.compareTo(a)>0)
            return c;

        return null;

    }
}
