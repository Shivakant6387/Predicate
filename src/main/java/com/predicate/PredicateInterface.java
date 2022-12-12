package com.predicate;

import java.util.List;
import java.util.function.Predicate;
public class PredicateInterface {
    static void pred(int number, Predicate<Integer> predicate)
    {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }
    public static void main(String[] args)
    {
        pred(10, (i) -> i > 7);
    }
}
