package com.BiPredicate.com;

public class Doman {
    String name;
    Integer scope;

    public Doman(String name, Integer scope) {
        this.name = name;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "Doman{" +
                "name='" + name + '\'' +
                ", scope=" + scope +
                '}';
    }
}
