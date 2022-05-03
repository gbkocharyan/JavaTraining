package com.company.Humans;

import java.util.Random;
import java.util.Scanner;

public class Human {
    private String name;
    private String surname;
    private int age;
    private String gender;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String isGender() {
        return gender;
    }


    public Human(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public static String generateRandomString(int len) {
        String chars = "ABCDEFIJKLMNOPSTUVABCDBCEILMNOPSTUABEFIJLMNOPUV";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(random.nextInt(chars.length())));
        return sb.toString();
    }

    public static String generateGender() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return "Male";
        }
        return "Female";
    }

    @Override
    public String toString() {
        return "Name: " + name + "," + " Surname: " + surname + "," + " Age: " + age + "," + " Gender: " + gender;
    }


    public static Human[] createRandomHumansArray() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length of array");

        Human[] humans = new Human[scanner.nextInt()];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human(Human.generateRandomString(random.nextInt(3, 8)),
                    Human.generateRandomString(random.nextInt(6, 12)),
                    random.nextInt(0, 90), Human.generateGender());
        }
        return humans;
    }


    public static void printArray(Human[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }


//    public static void printRandomHumansArray() {
//        Human[] humans = createRandomHumansArray();
//        printArray(humans);
//    }


    public static void sortAgeByGrowth() {
        Human[] humans = createRandomHumansArray();
        for (int i = 0; i < humans.length - 1; i++) {
            for (int j = 0; j < humans.length - i - 1; j++) {
                if (humans[j].getAge() > humans[j + 1].getAge()) {
                    Human temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
        }
        printArray(humans);
    }


    public static void sortAgeByDesc() {
        Human[] humans = createRandomHumansArray();
        for (int i = 0; i < humans.length - 1; i++) {
            for (int j = 0; j < humans.length - i - 1; j++) {
                if (humans[j].getAge() < humans[j + 1].getAge()) {
                    Human temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
        }
        printArray(humans);
    }


    public static void averageOfAge(Human[] array) {
        int sum = 0;
        int average;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getAge();
        }
        average = sum / array.length;
        System.out.println();
        System.out.println("Average of age of humans is: " + average);
    }


    public static void oldestAndYoungestHumans(Human[] array) {
        int max = array[0].getAge();
        int min = array[0].getAge();
        int j = 0;
        int k = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i].getAge()) {
                max = array[i].getAge();
                j = i;
            }

            if (min > array[i].getAge()) {
                min = array[i].getAge();
                k = i;
            }
        }
        System.out.println();
        System.out.println("Oldest human's age is: " + array[j].getAge() + " and surname is: " + array[j].getSurname());

        System.out.println();
        System.out.println("Youngest human's age is: " + array[k].getAge() + " and surname is: " + array[k].getSurname());
    }


    public static void longestName(Human[] array) {
        int length = array[0].getName().length();
        for (int i = 0; i < array.length; i++) {
            if (length < array[i].getName().length()) {
                length = array[i].getName().length();
            }
        }

        System.out.println();
        System.out.println("Humans with longest name are:");
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName().length() == length) {
                System.out.println(array[i].toString());
            }
        }
    }


    public static void shortestSurname(Human[] array) {
        int length = array[0].getSurname().length();
        for (int i = 0; i < array.length; i++) {
            if (length > array[i].getSurname().length()) {
                length = array[i].getSurname().length();
            }
        }

        System.out.println();
        System.out.println("Humans with shortest surname are:");
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSurname().length() == length) {
                System.out.println(array[i].toString());
            }
        }
    }


    public static void countOfGenders(Human[] array) {
        int countOfMale = 0;
        int countOfFemale;
        for (int i = 0; i < array.length; i++) {
            if (array[i].isGender().equals("Male")) {
                countOfMale++;
            }
        }
        countOfFemale = array.length - countOfMale;

        System.out.println();
        System.out.println("Count of Male in Humans is: " + countOfMale);
        System.out.println("Count of Female in Humans is: " + countOfFemale);
    }


    public static void humansOfRepeatedAge(Human[] array) {
        Human[] duplicateArray = new Human[array.length];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i].getAge() == array[j].getAge()) {
                    duplicateArray[i] = array[i];
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
            }
        }

        System.out.println();
        if (maxCount == 0) {
            System.out.println("There aren't humans whose ages are the same.");
        } else {
            System.out.println("Humans whose ages are same are։");
            for (int i = 0; i < duplicateArray.length; i++) {
                if (duplicateArray[i] != null) {
                    System.out.println(duplicateArray[i].toString());
                }
            }

            Human[] repeatedAgeArray = new Human[array.length];
            for (int i = 0; i < array.length; i++) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (i != j && array[i].getAge() == array[j].getAge()) {
                        duplicateArray[i] = array[i];
                        count++;
                    }
                }
                if (count == maxCount) {
                    repeatedAgeArray[i] = array[i];
                }
            }

            for (int i = 0; i < repeatedAgeArray.length; i++) {
                for (int j = i + 1; j < repeatedAgeArray.length; j++) {
                    if (repeatedAgeArray[i] != null && repeatedAgeArray[j] != null && repeatedAgeArray[i].getAge() == repeatedAgeArray[j].getAge()) {
                        repeatedAgeArray[j] = null;
                    }
                }
            }

            System.out.println();
            System.out.print("The most recurring ages are: ");
            for (int i = 0; i < repeatedAgeArray.length; i++) {
                if (repeatedAgeArray[i] != null) {
                    System.out.print(array[i].getAge() + "  ");
                }
            }
        }
        System.out.println();

    }

    public static void countOfPensioners(Human[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 65) {
                count++;
            }
        }
        System.out.println();
        if (count == 0) {
            System.out.println("There aren't pensioners in array.");
        } else {
            System.out.println("Count of pensioners in array is: " + count);
        }
    }

}


