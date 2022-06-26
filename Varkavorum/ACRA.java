package com.company.Varkavorum;

import java.util.Random;

public class ACRA {
    private int score;
    private static ACRA instance;

    private ACRA() {

    }

    public static ACRA getInstance() {
        if (instance == null) {
            instance = new ACRA();
        }
        return instance;
    }

    public int  score (){
        Random random = new Random();
        score = random.nextInt(400,850);
        System.out.println("Customer's score is " + score);
        return  score;
    }

}
