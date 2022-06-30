package com.company.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Davit", 32);

        List <Human> list1 = new ArrayList<>();

        list1.add(doctor);
        System.out.println(list1.get(0).toString());

        TaxiG<QA> taxi1 = new TaxiG<>(new QA("John", 35));
        TaxiG<Human> taxi2 = new TaxiG<>(new Banker("Adam", 27));
        TaxiG<Doctor> taxi3 = new TaxiG<>(new Doctor("Peter", 30));
        TaxiG<? extends Human> taxi4 = new TaxiG<>(new Banker("Mary", 42));


        List<? extends Number> arrayList1 = new ArrayList<Integer>();
        List<? extends Number> arrayList2 = new ArrayList<Double>();
        List<? extends Number> arrayList3 = new ArrayList<Number>();
        List<? super Integer> arrayList4 = new ArrayList<Object>();
        List<? super Integer> arrayList5 = new ArrayList<Number>();

    }
}
