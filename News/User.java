package com.company.News;

public class User implements OnNewPostListener {
    private String name;

    public User(String name){
        this.name=name;
    }

    @Override
    public void newPostPublished(String content) {
        System.out.println("User " + name+ " notified obout "+ content);

    }
}
