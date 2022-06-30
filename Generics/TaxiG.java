package com.company.Generics;

class TaxiG<T extends Human> {
    private T human;

    public TaxiG(T human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "TaxiG{" +
                "human=" + human +
                '}';
    }
}
