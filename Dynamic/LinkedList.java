package com.company.Dynamic;

public class LinkedList implements Changeable {
    private Node head;
    private int count = 0;

    // Method to insert a new node from the end
    @Override
    public void add(String data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        // If the Linked List is empty, then make the new node as head
        if (this.head == null) {
            this.head = newNode;
        } else {
            // Else traverse till the last node and insert the newNode there
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the newNode at last node
            last.next = newNode;
        }
        count++;
    }


    // Method to insert a new node from the beginning
    public void addFromTheBeginning(String data) {
        Node newNode = new Node(data);

        if (this.head != null) {
            newNode.next = this.head;
        }
        this.head = newNode;
        count++;
    }

    // Method that returns size
    @Override
    public int getSize() {
        System.out.println("\nSize of LinkedList equals " + count);
        return count;
    }


    // Method to delete a node in the LinkedList by KEY
    public void deleteByKey(String key) {
        // Store head node
        Node currNode = this.head;
        Node prev = null;

        // CASE 1: If head node itself holds the key to be deleted
        if (currNode != null && currNode.getData().equals(key)) {
            this.head = currNode.next; // Changed head

            // Display the message
            System.out.println(key + " found and deleted");
            count--;
        }

        // CASE 2: If the key is somewhere other than at head
        // Search for the key to be deleted, keep track of the previous node as it is needed to change currNode.next
        while (currNode != null && !currNode.getData().equals(key)) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode Unlink currNode from linked list
            prev.next = currNode.next;

            // Display the message
            System.out.println(key + " found and deleted");
            count--;
        }

        // CASE 3: The key is not present
        // If key was not present in linked list currNode should be null
        if (currNode == null) {
            System.out.println(key + " not found");
        }
    }


    // Method to delete a node in the LinkedList by POSITION
    @Override
    public void deleteAtPosition(int index) {
        // Store head node
        Node currNode = this.head;
        Node prev = null;

        // CASE 1: If index is 0, then head node itself is to be deleted
        if (index == 0 && currNode != null) {
            this.head = currNode.next; // Changed head

            // Display the message
            System.out.println(index + " position element deleted");
            count--;
        }

        // CASE 2: If the index is greater than 0 but less than the size of LinkedList
        // The counter
        int counter = 0;

        // Count for the index to be deleted, keep track of the previous node as it is needed to change currNode.next
        while (currNode != null) {
            if (counter == index) {
                // Since the currNode is the required position Unlink currNode from linked list
                prev.next = currNode.next;

                // Display the message
                System.out.println("\n" + index + " position element deleted");
                count--;
                break;
            } else {
                // If current position is not the index continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        // CASE 3: The index is greater than the size of the LinkedList
        // In this case, the currNode should be null
        if (currNode == null) {
            System.out.println("\n" + index + " position element not found");
        }
    }


    // Method to delete all nodes in the LinkedList
    @Override
    public void clean() {
        Node currNode = this.head;

        while (currNode != null) {
            this.head = currNode.next;
            currNode = currNode.next;
        }
    }


    // Method to print the LinkedList.
    public void print() {
        Node currNode = this.head;

        System.out.print("\nLinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.getData() + " ");

            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("\n");
    }


    // Method to get a node from the LinkedList by position
    @Override
    public String getByPosition(int index) {
        Node currNode = this.head;
        Node newNode = null;

        if (index == 0 && currNode != null) {
            newNode = currNode;
            System.out.println("\n" + index + " position element is: " + newNode.getData());
        }
        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                newNode = currNode;
                System.out.println("\n" + index + " position element is: " + newNode.getData());
                break;
            } else {
                currNode = currNode.next;
                counter++;
            }
        }

        if (index < 0 || currNode == null) {
            System.out.println("\nNot value");
            return null;
        }
        return newNode.getData();
    }


    // Method to get a node from the LinkedList by KEY
    public String getByKey(String key) {
        Node currNode = this.head;

        while (currNode != null && !currNode.getData().equals(key)) {
            currNode = currNode.next;
        }

        if (currNode != null && currNode.getData().equals(key)) {
            System.out.println("\n" + key + " found");
        }

        if (currNode == null) {
            System.out.println("\n" + key + " not found");
            return null;
        }
        return currNode.getData();
    }


}
