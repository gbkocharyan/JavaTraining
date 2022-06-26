package com.company.Builder;

public class Car {
    private final String mark;
    private final int year;
    private final int power;
    private final String color;
    private Car (Builder builder) {
        this.mark = builder.mark;
        this.year = builder.year;
        this.power = builder.power;
        this.color = builder.color;
    }

    public String getMark() {
        return mark;
    }

    public int getYear() {
        return year;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }


    public static class Builder {
        private String mark;
        private int year;
        private int power;
        private String color;

        public Builder() {

        }

        public Builder setMark(String mark) {
            this.mark = mark;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setPower(int power) {
            this.power = power;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}
