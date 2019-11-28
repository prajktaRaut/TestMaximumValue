package com.testmaximum;

public class MaximumValue<E extends Comparable<E>> {

    public static<E> E FindMaxValueOfAnyType(E a, E b, E c) {

        if (a.toString().compareTo(b.toString())>0)
            return a ;

        if (b.toString().compareTo(c.toString())>0)
            return b;

        if (c.toString().compareTo(a.toString())>0)
            return c;

        return null;

    }

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

    public String findMaximumStringValue(String a, String b, String c) {

        if (a.compareTo(b)>0)
            return a ;

        if (b.compareTo(c)>0)
            return b;

        if (c.compareTo(a)>0)
            return c;

        return null;


    }
}
