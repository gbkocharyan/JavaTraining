package com.company.Dynamic;

public class Node {
    private String data;
    Node next;

    // Constructor
    Node(String data) {
        this.data = data;
        next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
