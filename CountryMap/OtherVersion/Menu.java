package com.company.CountryMap.OtherVersion;

import java.util.Scanner;

public class Menu {
    Requests requests=new Requests();
    private static Menu instance;

    private Menu() {
        System.out.println("HI, now you can get country's currencies or input them.");
    }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    public void menu() {
        System.out.println("If you want to play please press enter, if you want to exit, please input EXIT");
        String input = new Scanner(System.in).nextLine();
        if (input.equalsIgnoreCase("EXIT")) {
            System.out.println("You finished the process");
        } else {
            requests.request();
            menu();
        }
    }
}
