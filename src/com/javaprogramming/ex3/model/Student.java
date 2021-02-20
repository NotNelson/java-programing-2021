package com.javaprogramming.ex3.model;

public class Student extends Person {
    protected String idNum;
    protected double averageMark;

    public Student(String name, int age, String gender, String idNum, double averageMark) {
        super(name, age, gender);
        idNum = idNum;
        averageMark = averageMark;
    }
}
