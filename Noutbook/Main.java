package com.company.Noutbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"Dell", "Lenovo", "Asus", "Acer", "HP"};

        List<Integer> id = new ArrayList<>();

        List<Noutbook> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Noutbook(names[random.nextInt(0, 5)], random.nextInt(2019, 2023),
                    random.nextInt(1, 10), ("DeviceId " + random.nextInt(1, 1000))));
        }

        

        System.out.println(list);
    }
}
