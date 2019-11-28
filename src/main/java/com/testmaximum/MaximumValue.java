package com.testmaximum;

public class MaximumValue<E,Y,Z> {

    E x,y,z;
    Y p,q,r;
    Z l,m,n;

    public MaximumValue(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MaximumValue(E x, E y, E z, Y p, Y q, Y r, Z l, Z m, Z n) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.p = p;
        this.q = q;
        this.r = r;
        this.l = l;
        this.m = m;
        this.n = n;
    }

    public static<E> E FindMaxValueOfAnyType(E a, E b, E c) {

        if (a.toString().compareTo(b.toString())>0)
            return a ;

        if (b.toString().compareTo(c.toString())>0)
            return b;

        if (c.toString().compareTo(a.toString())>0)
            return c;

        return null;

    }

    public static Integer findMaximumIntegerValue(Integer a, Integer b, Integer c) {

        if (a.compareTo(b)>0)
            return a ;

        if (b.compareTo(c)>0)
            return b;

        if (c.compareTo(a)>0)
            return c;

        return null;

    }

    public static Float findMaximumFloatValue(Float a, Float b, Float c) {

        if (a.compareTo(b)>0)
            return a ;

        if (b.compareTo(c)>0)
            return b;

        if (c.compareTo(a)>0)
            return c;

        return null;

    }

    public static String findMaximumStringValue(String a, String b, String c) {

        if (a.compareTo(b)>0)
            return a ;

        if (b.compareTo(c)>0)
            return b;

        if (c.compareTo(a)>0)
            return c;

        return null;


    }
    public void testMaximum() {

        E value1 =FindMaxValueOfAnyType(x,y,z);
        Y value2=FindMaxValueOfAnyType(p,q,r);
        Z value3=FindMaxValueOfAnyType(l,m,n);

        printMax(value1,value2,value3);
    }

    private void printMax(E value1, Y value2, Z value3) {

        System.out.println("Max Value of Integer is "+value1);
        System.out.println("Max Value of Float is "+value2);
        System.out.println("Max Value of String is "+value3);
    }


}
