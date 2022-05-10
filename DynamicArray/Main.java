package com.company.DynamicArray;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        Random random = new Random();

        String[] array = new String[35];
        System.out.println("Initial array");
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(random.nextInt(100));
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) > 50) {
                da.addElement(array[i]);
            }
        }

        da.reduceSize();

        System.out.println("\n\nDynamic array");
        for (int i = 0; i < da.getSizeOfArray(); i++) {
            System.out.print(da.getArray()[i] + " ");
        }
        System.out.println();
    }
}
