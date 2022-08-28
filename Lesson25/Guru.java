package com.company.Lesson25;

public class Guru implements AbstractA {
    AbstractA abstractA;

    public Guru() {
    }

    public Guru(AbstractA abstractA) {
        this.abstractA = abstractA;
    }

    @Override
    public void g() {
        System.out.println("default");
    }

    public void doSomething() {
        if (abstractA != null) {
            abstractA.g();
        } else {
            g();
        }
    }

}
