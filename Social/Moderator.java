package com.company.Social;

import java.util.Scanner;

public class Moderator {
    public User createUser(Humans human) {
        return Social.createProfile(human);
    }

    public void createChat(User user, String username) {
        for (int i = 0; i < Social.users.length; i++) {
            if (Social.users[i].getUsername().equals(username)){
                user = Social.users[i];
                System.out.println(user.toString());
            }
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Social.users.length; i++) {
            if (i == scanner.nextInt()) {
                System.out.println("start chat vit " + user + "and" + Social.users[i]);

            }
        }
    }
}
