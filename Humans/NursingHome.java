package com.company.Humans;

public class NursingHome {


    public static void pensionersArray(Human[] array) {
        Human[] pensioners = new Human[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 65) {
                pensioners[i] = array[i];
                count++;
            }
        }

        if (count == 0) {
            System.out.println("There aren't pensioners in nursing home.");
        } else {
            System.out.println();
            System.out.println("The pensioners are: ");
            for (int i = 0; i < pensioners.length; i++) {
                if (pensioners[i] != null) {
                    System.out.println(pensioners[i].toString());
                }
            }
        }
    }

}
