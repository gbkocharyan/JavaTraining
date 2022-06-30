package com.company.Dynamic;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        LinkedList <String> myList = new LinkedList<>();
//        myList.add("A");
//        myList.add("B");
//        myList.add("C");
//        myList.add("D");
//        myList.add("E");
//        myList.add("F");
//
//        myList.print();
//
//        myList.addFromTheBeginning("G");
//        myList.print();
//
//        myList.getSize();
//
//        myList.deleteAtPosition(2);
//        myList.print();
//
//        myList.getSize();
//
//        myList.clean();
//        myList.print();
//
//        myList.getByKey("N");



        DynamicArray da = new DynamicArray();
        Random random = new Random();
        da.getByPosition(2);

        String[] array = new String[35];
        System.out.println("\nInitial array");
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(random.nextInt(100));
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) > 50) {
                da.add(array[i]);
            }
        }

        da.reduceSize();

        System.out.println("\n\nDynamic array");
        da.print();
        System.out.println();
        da.getSize();
        da.getByPosition(11);
    }


}
