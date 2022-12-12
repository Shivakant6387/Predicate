package com.predicate;

import java.util.function.Predicate;

public class PredicateInterface4
{
    public static Predicate<String>hasLengthOf10=new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length()>10;
        }
    };

    public static void main(String[] args) {
        predicate_or();
    }

    private static void predicate_or() {
        Predicate<String >containLetterA=p->p.contains("A");
        String containsA="And";
        boolean outCome=hasLengthOf10.or(containLetterA).test(containsA);
        System.out.println(outCome);
    }
}
