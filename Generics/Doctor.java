package com.company.Generics;

public class Doctor extends Human {

    public Doctor(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Doctor";
    }

}
