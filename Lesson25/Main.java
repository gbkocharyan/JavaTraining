package com.company.Lesson25;

public class Main {
    public static void main(String[] args) {

        Guru guru = new Guru(new A());
        guru.doSomething();
        guru = new Guru(new B());
        guru.doSomething();
        guru = new Guru();
        guru.doSomething();

    }

}
