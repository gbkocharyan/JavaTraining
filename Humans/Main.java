package com.company.Humans;

public class Main {

    public static void main(String[] args) {
        Human[] humans = Human.createRandomHumansArray();
        Human.printArray(humans);
        Human.averageOfAge(humans);
        Human.oldestAndYoungestHumans(humans);
        Human.longestName(humans);
        Human.shortestSurname(humans);
        Human.countOfGenders(humans);
        Human.humansOfRepeatedAge(humans);
        Human.countOfPensioners(humans);
        NursingHome.pensionersArray(humans);

    }

}
