package com.example.week6;

public class User {
    private Cat cat;
    private int age;

    public User() {}

    public User(Cat cat, int age) {
        this.cat = cat;
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}