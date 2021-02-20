package com.javaprogramming.ex3.model;

public class Teacher extends Person {
    protected String subject;
    protected double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super (name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + ", salary: " + this.salary + ", subject: " + this.subject;
    }
}
