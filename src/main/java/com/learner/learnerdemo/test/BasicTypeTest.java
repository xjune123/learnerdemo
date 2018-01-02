package com.learner.learnerdemo.test;

import java.math.BigDecimal;

public class BasicTypeTest {
    public static void main(String[] args) {
        System.out.println((2.0-1.1));
        BigDecimal bigDecimal = new BigDecimal(2.0);
        BigDecimal bigDecimal2 = new BigDecimal(1.1);
        System.out.println(bigDecimal.subtract(bigDecimal2));

    }
}
