package com.company.Builder;

public class Main {
    public static void main(String[] args) {
            Car car1 = new Car.Builder()
            .setMark("Lexus")
            .setYear(2000)
            .setPower(221)
            .setColor("#000000")
            .build();

        System.out.println(car1.getMark());
    }
}
