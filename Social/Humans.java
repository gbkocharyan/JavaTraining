package com.company.Social;

import java.util.Scanner;

public class Humans {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private Boolean status;


    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public static  Humans[] createPeople() {
        Humans[] human = new Humans[3];
        for (int i = 0; i < human.length ; i++) {
            Scanner scanner = new Scanner(System.in);
            human[i] = new Humans();
            System.out.println("Input Name");
            human[i].setName(scanner.nextLine());
            System.out.println("Input Surname");
            human[i].setSurname(scanner.nextLine());
            System.out.println("Input age");
            human[i].setAge(scanner.nextInt());
            System.out.println("Insert Gender");
            human[i].setGender(scanner.nextLine());
        }
        return human;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name = " + name + '\'' +
                ", surname = " + surname + '\'' +
                ", age = " + age +
                ", gender = " + gender +
                '}';
    }
}
