package com.company;

import java.util.Scanner;

public class MobileOperator {

    public static void main(String[] args) {
        checkOperator();
    }

    public static String getUsername() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String username = input.nextLine();
        return username;
    }

    public static String getUserPhoneNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your phone number");
        System.out.println("For example 055484040");
        String userPhoneNumber = input.nextLine();
        return userPhoneNumber;
    }

    public static String getUserPhoneCode(String phoneNumber) {
        String userPhoneCode = phoneNumber.substring(0, 3);
        return userPhoneCode;
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        boolean isValid;
        if (phoneNumber.length() == 9) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }

    public static String stopProcess() {
        Scanner input = new Scanner(System.in);
        String cancel = input.nextLine();
        return cancel;
    }

    public static void checkOperator() {
        String username = getUsername();
        String userPhoneNumber = getUserPhoneNumber();
        boolean isValid = isValidPhoneNumber(userPhoneNumber);
        if (isValid == true) {
            String userPhoneCode = getUserPhoneCode(userPhoneNumber);
            String operatorName;
            switch (userPhoneCode) {
                case "091":
                    operatorName = "Beeline";
                    break;
                case "093":
                    operatorName = "VivaCell";
                    break;
                case "055":
                    operatorName = "Ucom";
                    break;
                default:
                    operatorName = "unknown";
                    break;
            }
            System.out.println("Dear " + username + ", your mobile operator is " + operatorName);
        } else  {
            System.out.println("Dear " + username + ", please enter 'EXIT' to finish process or press 'Enter' to continue");
            String cancel = stopProcess();
            if (cancel.equalsIgnoreCase("EXIT")) {
                System.out.println("Dear " + username + ", the process has been canceled by you");
            } else {
                checkOperator();
            }
        }
    }
}