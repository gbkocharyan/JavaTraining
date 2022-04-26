package com.company;

import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        runLottery();
    }

    public static int[] ticket() {
        int[] ticket = new int[9];
        int skipCount = 0;
        int addCount = 0;
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
            if (random.nextBoolean()) {
                if (addCount < 5) {
                    if (i == 0) {
                        ticket[i] = random.nextInt(1, 10);
                    } else if (i < 8) {
                        ticket[i] = random.nextInt((i * 10), ((i * 10) + 10));
                    } else {
                        ticket[i] = random.nextInt(80, 91);
                    }
                } else {
                    ticket[i] = 0;
                }
                addCount++;
            } else {
                if (skipCount < 4) {
                    ticket[i] = 0;
                } else {
                    if (i < 8) {
                        ticket[i] = random.nextInt((i * 10), ((i * 10) + 10));
                    } else {
                        ticket[i] = random.nextInt(80, 91);
                    }
                }
                skipCount++;
            }
        }
        System.out.print("| ");
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " | ");
        }
        System.out.println();
        return ticket;
    }

    public static int[] checkers() {
        int[] array = new int[90];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 91);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                    break;
                }
            }
        }
        return array;
    }

    public static void runLottery() {
        int[] ticket1 = ticket();
        int[] ticket2 = ticket();
        int[] checkers = checkers();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < checkers.length; i++) {
            for (int j = 0; j < ticket1.length; j++) {
                if (checkers[i] == ticket1[j]) {
                    ticket1[j] = 0;
                    count1++;
                }
                if (checkers[i] == ticket2[j]) {
                    ticket2[j] = 0;
                    count2++;
                }
            }
            if (count1 == 5 && count2 == 5) {
                System.out.print("| ");
                for (int j = 0; j < ticket1.length; j++) {
                    System.out.print(ticket1[j] + " | ");
                }
                System.out.println();
                System.out.print("| ");
                for (int j = 0; j < ticket2.length; j++) {
                    System.out.print(ticket2[j] + " | ");
                }
                System.out.println();
                System.out.println("Won both tickets");
                System.out.println("The following numbers are left in the bag");
                for (int j = (i + 1); j < checkers.length; j++) {
                    System.out.print(checkers[j] + " ");
                }
                break;
            }
            if (count1 == 5) {
                System.out.print("| ");
                for (int j = 0; j < ticket1.length; j++) {
                    System.out.print(ticket1[j] + " | ");
                }
                System.out.println();
                System.out.print("| ");
                for (int j = 0; j < ticket2.length; j++) {
                    System.out.print(ticket2[j] + " | ");
                }
                System.out.println();
                System.out.println("Won ticket1");
                System.out.println("The following numbers are left in the bag");
                for (int j = (i + 1); j < checkers.length; j++) {
                    System.out.print(checkers[j] + " ");
                }
                break;
            }
            if (count2 == 5) {
                System.out.print("| ");
                for (int j = 0; j < ticket1.length; j++) {
                    System.out.print(ticket1[j] + " | ");
                }
                System.out.println();
                System.out.print("| ");
                for (int j = 0; j < ticket2.length; j++) {
                    System.out.print(ticket2[j] + " | ");
                }
                System.out.println();
                System.out.println("Won ticket2");
                System.out.println("The following numbers are left in the bag");
                for (int j = (i + 1); j < checkers.length; j++) {
                    System.out.print(checkers[j] + " ");
                }
                break;
            }
        }
    }


}
