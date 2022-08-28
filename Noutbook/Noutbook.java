package com.company.Noutbook;

public class Noutbook {
    private String name;
    private int year;
    private int processor;
    private String deviceId;

    public Noutbook(String name, int year, int processor, String deviceId) {
        this.name = name;
        this.year = year;
        this.processor = processor;
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return "Noutbook{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", processor=" + processor +
                ", deviceId=" + deviceId +
                '}';
    }
}
