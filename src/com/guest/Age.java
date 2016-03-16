package com.guest;

public class Age {
    private final int age;

    public Age(int age) {
        this.age = age;
    }

    public boolean isPermitted(int legalAge) {
        return this.age > legalAge;
    }
}
