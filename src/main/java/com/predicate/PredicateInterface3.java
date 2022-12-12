package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface3 {
    String name,role;

    @Override
    public String toString() {
        return "PredicateInterface3{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    PredicateInterface3(String a, String b){
        name=a;
        role=b;
    }
    String getRole(){return role;}
    String getName(){return name;}


    public static List<PredicateInterface3>process(List<PredicateInterface3>users, Predicate<PredicateInterface3>predicate){
     List<PredicateInterface3>predicateInterface3s=new ArrayList<>();
     for (PredicateInterface3 user:users)
         if (predicate.test(user));
     return predicateInterface3s;
    }
    public static void main(String[] args) {
    List<PredicateInterface3>users=new ArrayList<>();
    users.add(new PredicateInterface3("Robert","Maki"));
    users.add(new PredicateInterface3("Mac","Mally"));
    List admins=process(users,(PredicateInterface3 u)->u.getRole().equals("Robert"));
        System.out.println(admins);
    }
}
