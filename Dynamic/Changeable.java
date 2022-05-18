package com.company.Dynamic;

public interface Changeable {

    void add(String data);
    int getSize();
    void deleteAtPosition(int index);
    void clean();
    String getByPosition(int index);
    void print();


}
