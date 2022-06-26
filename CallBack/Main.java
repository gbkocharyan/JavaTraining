package com.company.CallBack;

public class Main {
    public static void main(String[] args) {

        Government g1 = new Government();
        Grandmother hripsimeGrandma = new Grandmother();
        hripsimeGrandma.setAge(100);
        g1.setOnPensionListener(hripsimeGrandma);

        g1.setOnPensionListener(new OnPensionListener() {
            @Override
            public void onPensionReceived(double pensionAmount) {

            }
        });

    }
}
