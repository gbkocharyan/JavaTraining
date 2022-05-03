package com.company;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        countOfImportedNumber();
    }


    public static int input() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public static int[] randomArray() {
         System.out.println("Please enter array length");
         int length = input();
         System.out.println("Please enter min number");
         int minNumber = input();
         System.out.println("Please enter max number");
         int maxNumber = input();

         Random random = new Random();
         int[] array = new int[length];
         for (int i = 0; i < array.length; i++) {
             array[i] = random.nextInt(minNumber, maxNumber);
         }
         System.out.print("|");
         for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + "|");
         }
        System.out.println();
         return array;
    }

    public static void countOfImportedNumber() {
        int[] array = randomArray();
        System.out.println("Please enter number for check count of it in array");
        int num = input();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        System.out.println("Count of " + num + " in array: " + count);
    }

    public static void SQRT() {
        int[] array = randomArray();
        int[] sqrtArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j <= array[i] / 2; j++) {
                if (j * j == array[i]) {
                    sqrtArray[i] = array[i];
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("There is no number in array which have square root");
        } else if (count > 1) {
            System.out.println("The following numbers in array have square root:");
            for (int i = 0; i < sqrtArray.length; i++) {
                if(sqrtArray[i] > 0) {
                    System.out.print(sqrtArray[i] + " ");
                }
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < sqrtArray.length; i++) {
                if (max < sqrtArray[i]) {
                    max = sqrtArray[i];
                }
                if (sqrtArray[i] > 0 && min > sqrtArray[i]) {
                    min = sqrtArray[i];
                }
            }
            System.out.println();
            if (max == min) {
                System.out.println("Which all are equals.");
            } else {
                System.out.println("Of which: max is " + max + " and min is " + min);
            }
        } else {
            System.out.print("There is one number which have square root: ");
            for (int i = 0; i < sqrtArray.length; i++) {
                if (sqrtArray[i] > 0) {
                    System.out.print(sqrtArray[i]);
                }
            }
        }
    }

    public static void sumOfTwoNumbers() {
        int[] array = randomArray();
        System.out.println("Please enter the any number");
        int num = input();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    count++;
                    while(count <= 1) {
                        System.out.println("The two numbers whose sum is equal to the imported number, are:");
                        count++;
                    }
                    System.out.print(array[i] + " " + array[j]);
                    System.out.println();
                }
            }
        }
        if (count == 0) {
            System.out.println("There are no numbers in the array whose sum is equal to the imported number");
        }
    }

}
