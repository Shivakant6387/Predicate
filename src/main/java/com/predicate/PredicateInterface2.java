package com.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateInterface2 {
public static Predicate<String>hasLength101=new Predicate<String>() {
    @Override
    public boolean test(String s) {
        return s.length()>10;
    }
};
public static void predicate_and(){
    Predicate<String>nonNullPredicate= Objects::nonNull;
    String nullString=null;
    boolean outcome= nonNullPredicate.and(hasLength101).test(nullString);
    System.out.println(outcome);

    String lengthGTThan="welcome to the machine";
    boolean outcome2=nonNullPredicate.and(hasLength101).test(lengthGTThan);
    System.out.println(outcome2);
}
    public static void main(String[] args) {
predicate_and();
    }
}
