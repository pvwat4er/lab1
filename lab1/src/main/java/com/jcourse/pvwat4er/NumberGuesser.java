package com.jcourse.pvwat4er;

import java.util.Random;

public class NumberGuesser {


    public static void main(String[] args) {
        int i = 1 + new Random().nextInt()%100;
        System.out.println(i);
    }
}