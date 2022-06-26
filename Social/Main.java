package com.company.Social;


 class Main {
    public static void main(String[] args) {

        Humans[] human = new Humans[2];
        human = Humans.createPeople();
        Moderator moderator = new Moderator();
        for (int i = 0; i < human.length; i++) {
            System.out.println(moderator.createUser(human[i]));
        }
        System.out.println("Please insert your username");
        moderator.createChat(Social.users[0],"vandam");
    }

}
