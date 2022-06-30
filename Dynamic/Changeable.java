package com.company.Dynamic;

public interface Changeable <T> {

    void add(T data);
    int getSize();
    void deleteAtPosition(int index);
    void clean();
    String getByPosition(int index);
    void print();


}
