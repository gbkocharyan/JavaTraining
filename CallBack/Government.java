package com.company.CallBack;

import java.util.Scanner;

public class Government {

    private OnPensionListener onPensionListener;
    public void setOnPensionListener(OnPensionListener onPensionListener) {
        this.onPensionListener = onPensionListener;
    }
    public OnPensionListener getOnPensionListener() {
        return onPensionListener;
    }

    public void detectAction() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        if (command.equals("PENSION")) {
            //կատարել հաշվարկներ
            //բյուջեից փոխանցել
            //բարդ լոգիկաներ
            if(onPensionListener != null){
                onPensionListener.onPensionReceived(500000);
            }
        }

    }
}
