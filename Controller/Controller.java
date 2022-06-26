package com.company.Controller;

//how to create single object from class
public class Controller {
    private static Controller instance;

    private Controller() {
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }


    // ayl tarberak, bayc voch ardyunavet
    //    private static Controller instance = new Controller();
//
//    public Controller getInstance() {
//        return instance;
//    }

}
