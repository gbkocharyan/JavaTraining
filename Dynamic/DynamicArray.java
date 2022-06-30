package com.company.Dynamic;

public class DynamicArray <T> {
    private T[] array;
    private int count;
    private int sizeOfArray;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSizeOfArray() {
        return sizeOfArray;
    }

    public void setSizeOfArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }

    public DynamicArray() {
        sizeOfArray = 16;
        array = (T[]) new Object[sizeOfArray];
        count = 0;
    }

    //method that appends an element at the end of the array

    public void add(T element) {
        if (count == sizeOfArray) {
            growSize();
        }
        array[count] = element;
        count++;
    }


    //method that creates an array of larger size
    private void growSize() {
        T[] temp = null;
        if (count == sizeOfArray) {
            temp = (T[]) new Object[sizeOfArray + 16];
            for (int i = 0; i < sizeOfArray; i++) {
                temp[i] = array[i];
            }
        }
        sizeOfArray = sizeOfArray + 16;
        array = temp;
    }


    //method that adds an element at the specified index
    public void addAt(int index, T element) {
        if (count == sizeOfArray) {
            growSize();
        }
        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        count++;
    }


    //method that removes the last elements for the array
    public void delete() {
        if (count > 0) {
            array[count - 1] = null;
            count--;
        }
    }


    //method that deletes an element from the specified index

    public void deleteAtPosition(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1];
            }
            array[count - 1] = null;
            count--;
        }
    }


    public void clean() {
        if (count > 0) {
            for (int i = 0; i < sizeOfArray; i++) {
                array[i] = null;
            }
            reduceSize();
        }
    }


    public T getByPosition(int index) {
        T element = null;
        if (count <= 0) {
            System.out.println("\nThe array is empty");
            return null;
        } else if (index < 0 || index > count) {
            System.out.println("\nThe index is out of range of the array");
            return null;
        } else {
            for (int i = 0; i < sizeOfArray; i++) {
                if (i == index) {
                    System.out.println("\n" + index + " position element is: " + array[i]);
                    element = array[i];
                    break;
                }
            }
        }
        return element;
    }


    public void print() {
        if (count <= 0) {
            System.out.println("\nThe array is empty!");
        } else {
            System.out.print("\nArray: ");
            for (int i = 0; i < sizeOfArray; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    //method that removes the unused space
    public void reduceSize() {
        T[] temp = null;
        if (count > 0) {
            temp = (T[]) new Object[count];
            for (int i = 0; i < count; i++) {
                temp[i] = array[i];
            }
            sizeOfArray = count;
            array = temp;
        }
    }

    //method that returns the size of array
    public int getSize() {
        System.out.println("\nSize of array equals " + count);
        return count;
    }





}
