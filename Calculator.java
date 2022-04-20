package com.company;

import java.util.Scanner;

public class Calculator {
    public void run() {

        System.out.println("Enter first number");
        String num1 = inputString();
        if (containsIgnoreCase("C", num1)) {
            run();
        }

        System.out.println("Enter operator");
        String op = inputString();
        if (containsIgnoreCase("C", op)) {
            run();
        }

        String num2 = null;
        if (!op.equalsIgnoreCase("sqrt")) {
            System.out.println("Enter second number");
            num2 = inputString();
            if (containsIgnoreCase("C", num2)) {
                run();
            }
        }

        boolean isValid = true;
        double result = 0;
        switch (op.toLowerCase()) {
            case "+":
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                break;
            case "-":
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                break;
            case "*":
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                break;
            case "/":
                if (Integer.valueOf(num2) != 0) {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                } else {
                    isValid = false;
                }
                break;
            case "sqrt":
                int num = SQRT(Integer.valueOf(num1));
                if (num >= 1) {
                    result = num;
                } else {
                    isValid = false;
                }
            default:
                isValid = false;
                break;
        }
        if (isValid) {
            System.out.println(result);
        } else {
            System.out.println("Error");
        }
        run();
    }

    public boolean containsIgnoreCase(String substr, String str) {
        if (str.toLowerCase().contains(substr.toLowerCase())) {
            return true;
        } else return false;
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        String op = scanner.nextLine();
        return op;
    }

    public int SQRT(int num) {
        int result = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (i * i == num) {
                result = i;
            }
        }
        return result;
    }

}
