package com.BiPredicate.com;

import java.util.function.BiPredicate;

public class BiPredicateEx {
    public static void main(String[] args) {
        BiPredicate<String,Integer>biPredicate=(x,y)->{
            return x.length()==y;
        };

        boolean result=biPredicate.test("Mkyong",6);
        System.out.println(result);

    }
}
