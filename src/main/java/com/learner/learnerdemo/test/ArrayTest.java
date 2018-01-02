package com.learner.learnerdemo.test;

import java.util.Arrays;

public class ArrayTest
{
    public static void main(String[] args) {
        int[]  i = {1,3,5,7};
        int[] j = new int[0];
        j=i;
        //测试数组引用，这样子只是指针的引用，若要复制，需要使用Arrays.copyOf
        int[] k =Arrays.copyOf(i,i.length);
        j[1] = 9;
        System.out.println("i:"+Arrays.toString(i));
        System.out.println("j:"+Arrays.toString(j));
        System.out.println("k:"+Arrays.toString(k));



    }
}
