package com.company.Dynamic;

public class Node <T> {
    private T data;
    Node <T> next;

    // Constructor
    Node(T data) {
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;
    }

}
