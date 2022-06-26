package com.company.Social;

import java.util.Scanner;

public class Social {
    private static final int NO_POSITION = -1;

    public static User[] users = new User[10];

    public boolean register(User user) {
        if (isRegisterEnable()) {
            users[availablePosition()] = user;
            return true;
        }
        return false;
    }

    public void editAccount(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(user.getUsername())) {
                users[i].update(user);
            }
        }
    }

    public void removeAccount(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(user.getUsername())) {
                users[i] = null;
                break;
            }
        }
    }

    private boolean isRegisterEnable() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                return true;
            }
        }
        return false;
    }

    private static int availablePosition() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                return i;
            }
        }
        return NO_POSITION;
    }

    public static User createProfile(Humans human) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("username");
        if (scanner.nextLine().length() < 3) {
            scanner.nextLine();
        } else {
            user.setUsername(scanner.nextLine());
        }
        System.out.println("mail");

        user.setEmail(scanner.nextLine());

        human.setStatus(true);
        for (int i = 0; i < users.length; i++) {
            users[i] = user;
        }
        return user;
    }
}
