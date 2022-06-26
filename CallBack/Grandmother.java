package com.company.CallBack;

public class Grandmother extends Human implements OnPensionListener {

    private int money = 500000;
    @Override
    public void onPensionReceived(double pensionAmount) {
        money += pensionAmount;
    }
}
