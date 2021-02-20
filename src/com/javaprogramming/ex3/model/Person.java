package com.javaprogramming.ex3.model;

public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        name = name;
        age = age;
        gender = gender;
    }

    public String toString() {
        return name + ", age: " + age + ", gender: " + gender;
    }
}
