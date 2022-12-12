package com.predicate;

import java.util.function.Predicate;

public class PredicateInterfaceEx {
    public static void main(String[] args) {
        Predicate<Integer>lesserThan=integer -> (integer<19);
        System.out.println(lesserThan.test(10));
    }
}
