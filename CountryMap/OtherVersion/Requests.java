package com.company.CountryMap.OtherVersion;

import java.util.*;

public class Requests implements NewRequest {

    Scanner scanner = new Scanner(System.in);
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


    @Override
    public void request(){
        currency();
        System.out.println("input country");

        try {
            inputCountry = Countries.valueOf(scanner.next().toUpperCase(Locale.ROOT));
            if (currency.containsKey(inputCountry)) {
                System.out.println(currency.get(inputCountry));
            } else {
                System.out.println("we do not have such country, please input the currency and we will add it to our list");
                inputCurrency = scanner.next();
                currency.put(inputCountry, inputCurrency);
                System.out.println(inputCurrency);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid country name");
        }
    }
}
