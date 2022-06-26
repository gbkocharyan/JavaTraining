package com.company.Varkavorum;

import java.util.Scanner;

public class Passport {
    Scanner sc = new Scanner(System.in);
    private final String passportSeries;
    private final String name;
    private final String surname;
    private final String expiryDate;
    private Passport(Builder builder) {
        this.passportSeries = builder.passportSeries;
        this.name = builder.name;
        this.surname = builder.surname;
        this.expiryDate = builder.expiryDate;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public static class Builder{
        private final String passportSeries;
        private final String name;
        private final String surname;
        private final String expiryDate;

        Scanner sc = new Scanner(System.in);

        public Builder() {
            System.out.println("Passport:enter the name");
            this.name = sc.next();
            System.out.println("Passport:enter the surname");
            this.surname = sc.next();
            System.out.println("Passport:enter the passport ID");
            this.passportSeries = sc.next();
            System.out.println("Passport:enter the Expiry date");
            this.expiryDate = sc.next();
        }

        public Passport build() {
            return new Passport(this);
        }
    }

    @Override
    public String toString() {
        return "Passport{" +
                "PassportSeries='" + passportSeries + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
