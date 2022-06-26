package com.company.Social;

public class User {
    private String email;
    private String username;
    private Integer age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void update(User user) {
        if (user.age != null) {
            age = user.age;
        }
        if (user.email != null) {
            email = user.email;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
