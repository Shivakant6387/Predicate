package com.predicate;

import java.util.function.Predicate;

public class PredicateInterfaceEx2 {
    public static void main(String[] args) {
        Predicate<Integer>greaterThan=(integer -> integer>10);
        Predicate<Integer>lessThen=(integer -> integer<20);
        boolean result=greaterThan.and(lessThen).test(15);
        System.out.println(result);
        boolean result2=greaterThan.and(lessThen).negate().test(15);

        System.out.println(result2);

        boolean result3=greaterThan.or(lessThen).test(15);
        System.out.println(result3);
    }
}
