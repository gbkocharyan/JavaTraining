package com.company.DynamicArray;

public class DynamicArray {
    private String array[];
    private int count;
    private int sizeOfArray;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
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
        array = new String[sizeOfArray];
        count = 0;
    }

    //method that appends an element at the end of the array
    public void addElement(String element) {
        if (count == sizeOfArray) {
            growSize();
        }
        array[count] = element;
        count++;
    }


    //method that creates an array of larger size
    public void growSize() {
        String[] temp = null;
        if (count == sizeOfArray) {
            temp = new String[sizeOfArray + 16];
            for (int i = 0; i < sizeOfArray; i++) {
                temp[i] = array[i];
            }
        }
        sizeOfArray = sizeOfArray + 16;
        array = temp;
    }

    //method that adds an element at the specified index
    public void addElementAt(int index, String element) {
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
    public void removeElement() {
        if (count > 0) {
            array[count - 1] = null;
            count--;
        }
    }


    //method that deletes an element from the specified index
    public void removeElementAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1];
            }
            array[count - 1] = null;
            count--;
        }
    }


    //method that removes the unused space
    public void reduceSize() {
        String[] temp = null;
        if (count > 0) {
            temp = new String[count];
            for (int i = 0; i < count; i++) {
                temp[i] = array[i];
            }
            sizeOfArray = count;
            array = temp;
        }
    }


}
