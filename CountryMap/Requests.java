package com.company.CountryMap;


import java.util.HashMap;
import java.util.Scanner;

public class Requests implements NewRequest {
    Scanner scanner = new Scanner(System.in);
    private String typeID;
    private String inputCurrency;

    public Countries getInputCountry() {
        return inputCountry;
    }

    public void setInputCountry(Countries inputCountry) {
        this.inputCountry = inputCountry;
    }

    public Requests() {

    }

    private Countries inputCountry;

    HashMap<Countries, String> currency = new HashMap<>();

    public HashMap<Countries, String> currency() {
        currency.put(Countries.ARMENIA, "AMD");
        currency.put(Countries.RUSSIA, "RUR");
        currency.put(Countries.USA, "USD");
        return currency;
    }


    public void ID() {

        switch (typeID = scanner.next().toUpperCase()) {
            case "ARMENIA":
                inputCountry = Countries.ARMENIA;
                break;
            case "GEORGIA":
                inputCountry = Countries.GEORGIA;
                break;
            case "RUSSIA":
                inputCountry = Countries.RUSSIA;
                break;
            case "USA":
                inputCountry = Countries.USA;
                break;
            case "CHINA":
                inputCountry = Countries.CHINA;
                break;
            case "INDIA":
                inputCountry = Countries.INDIA;
                break;
            case "JAPAN":
                inputCountry = Countries.JAPAN;
                break;
            case "UKRAINE":
                inputCountry = Countries.UKRAINE;
                break;
            case "UAE":
                inputCountry = Countries.UAE;
                break;
            case "IRAN":
                inputCountry = Countries.IRAN;
                break;
            default:
                inputCountry = null;
                break;
        }
    }

    public static String repeatProcess() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    @Override
    public void request() {
        currency();
        System.out.println("Please enter the country name");
        ID();

        if (currency.containsKey(inputCountry)) {
            System.out.println("The currency of " + inputCountry.toString().toUpperCase() + " is " + currency.get(inputCountry));
        } else if (!currency.containsKey(inputCountry) && (inputCountry != null)) {
            System.out.println(inputCountry.toString().toUpperCase() + "'s currency is not in MAP, please enter it");
            inputCurrency = scanner.next();
            currency.put(inputCountry, inputCurrency);
            System.out.println("The currency of " + inputCountry.toString().toUpperCase() + " is " + currency.get(inputCountry));
        } else {
            System.out.println("The country is missing from the countries list");
        }

        System.out.println("Please enter 'EXIT' to finish process or press 'Enter' to continue");
        String input = repeatProcess();
        if (input.equalsIgnoreCase("EXIT")) {
            System.out.println("The process has been canceled by you");
        } else {
            request();
        }
    }
}

